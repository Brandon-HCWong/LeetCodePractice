package com.brandonhc.code.leetcode.linkedlist

import android.util.Log
import com.brandonhc.code.ListNode
import com.brandonhc.code.TestUtils
import com.brandonhc.code.flat

/**
 * ## Medium
 * ## 86. Partition List
 * ## [Website Link](https://leetcode.com/problems/partition-list/)
 */

object Code0086 {
    fun partition(head: ListNode?, x: Int): ListNode? {
        val dummyNodeLesser = ListNode(Int.MIN_VALUE)
        val dummyNodeLarger = ListNode(Int.MIN_VALUE)

        var ptrHead = head
        var ptrLarger = dummyNodeLarger
        var ptrLesser = dummyNodeLesser

        while (ptrHead != null) {
            if (ptrHead.`val` >= x) {
                ptrLarger.next = ptrHead
                ptrLarger = ptrHead
            } else {
                ptrLesser.next = ptrHead
                ptrLesser = ptrHead
            }
            val nextNode = ptrHead.next
            ptrHead.next = null
            ptrHead = nextNode
        }
        ptrLesser.next = dummyNodeLarger.next

        return dummyNodeLesser.next
    }

    fun runTest() {
        testCase1()
        testCase2()
    }

    private fun testCase1() {
        Log.d("BrandonLog", "[Code0086-testCase1]: ")
        // Arrange
        val head = ListNode.generateFromList(arrayListOf(1,4,3,2,5,2))
        val x = 3
        val answer = arrayListOf(1,2,2,4,3,5)
        Log.d("BrandonLog", "input head = ${head.flat()}")
        Log.d("BrandonLog", "input x = $x")

        // Act
        val result = partition(head, x).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase2() {
        Log.d("BrandonLog", "[Code0086-testCase2]: ")
        // Arrange
        val head = ListNode.generateFromList(arrayListOf(2,1))
        val x = 2
        val answer = arrayListOf(1,2)
        Log.d("BrandonLog", "input head = ${head.flat()}")
        Log.d("BrandonLog", "input x = $x")

        // Act
        val result = partition(head, x).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }
}