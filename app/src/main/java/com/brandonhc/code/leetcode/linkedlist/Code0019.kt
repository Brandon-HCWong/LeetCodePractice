package com.brandonhc.code.leetcode.linkedlist

import android.util.Log
import com.brandonhc.code.ListNode
import com.brandonhc.code.TestUtils
import com.brandonhc.code.flat

/**
 * ## Medium
 * ## 19. Remove Nth Node From End of List
 * ## [Website Link](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */

object Code0019 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val nodeDummy = ListNode(Int.MIN_VALUE).apply {
            next = head
        }
        var nodeFast: ListNode? = nodeDummy
        var nodeSlow: ListNode? = nodeDummy

        // Move FastNode forward by n steps.
        for (step in 1..n) {
            nodeFast = nodeFast?.next
        }

        // Move both nodes forward until end reached.
        while (nodeFast?.next != null) {
            nodeSlow = nodeSlow?.next
            nodeFast = nodeFast.next
        }

        // Remove Nth node.
        val nextNode = nodeSlow?.next?.next
        nodeSlow?.next?.next = null
        nodeSlow?.next = nextNode

        return nodeDummy.next
    }

    fun runTest() {
        testCase1()
        testCase2()
        testCase3()
    }

    private fun testCase1() {
        Log.d("BrandonLog", "[Code0019-testCase1]: ")
        // Arrange
        val head = ListNode.generateFromList(arrayListOf(1,2,3,4,5))
        val n = 2
        val answer = arrayListOf(1,2,3,5)
        Log.d("BrandonLog", "input list1 = ${head.flat()}")
        Log.d("BrandonLog", "input n = $n")

        // Act
        val result = removeNthFromEnd(head, n).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase2() {
        Log.d("BrandonLog", "[Code0019-testCase2]: ")
        // Arrange
        val head = ListNode.generateFromList(arrayListOf(1))
        val n = 1
        val answer = arrayListOf<Int>()
        Log.d("BrandonLog", "input list1 = ${head.flat()}")
        Log.d("BrandonLog", "input n = $n")

        // Act
        val result = removeNthFromEnd(head, n).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase3() {
        Log.d("BrandonLog", "[Code0019-testCase3]: ")
        // Arrange
        val head = ListNode.generateFromList(arrayListOf(1,2))
        val n = 1
        val answer = arrayListOf(1)
        Log.d("BrandonLog", "input list1 = ${head.flat()}")
        Log.d("BrandonLog", "input n = $n")

        // Act
        val result = removeNthFromEnd(head, n).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }
}