package com.brandonhc.code.leetcode.linkedlist

import android.util.Log
import com.brandonhc.code.ListNode
import com.brandonhc.code.TestUtils
import com.brandonhc.code.flat

/**
 * ## Easy
 * ## 876. Middle of the Linked List
 * ## [Website Link](https://leetcode.com/problems/middle-of-the-linked-list/)
 */

object Code0876 {
    fun middleNode(head: ListNode?): ListNode? {
        val nodeDummy = ListNode(Int.MIN_VALUE).apply {
            next = head
        }
        var nodeSlow: ListNode? = nodeDummy
        var nodeFast: ListNode? = nodeDummy

        while (nodeFast != null) {
            nodeSlow = nodeSlow?.next
            nodeFast = nodeFast.next?.next
        }

        return nodeSlow
    }

    fun runTest() {
        testCase1()
        testCase2()
    }

    private fun testCase1() {
        Log.d("BrandonLog", "[Code0876-testCase1]: ")
        // Arrange
        val head = ListNode.generateFromList(arrayListOf(1,2,3,4,5))
        val answer = arrayListOf(3,4,5)
        Log.d("BrandonLog", "input head = ${head.flat()}")

        // Act
        val result = middleNode(head).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase2() {
        Log.d("BrandonLog", "[Code0876-testCase2]: ")
        // Arrange
        val head = ListNode.generateFromList(arrayListOf(1,2,3,4,5,6))
        val x = 2
        val answer = arrayListOf(4,5,6)
        Log.d("BrandonLog", "input head = ${head.flat()}")

        // Act
        val result = middleNode(head).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }
}