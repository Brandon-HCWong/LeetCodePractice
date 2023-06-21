package com.brandonhc.code.leetcode.linkedlist

import android.util.Log
import com.brandonhc.code.ListNode
import com.brandonhc.code.TestUtils
import com.brandonhc.code.flat

/**
 * ## Easy
 * ## 21. Merge Two Sorted Lists
 * ## [Website Link](https://leetcode.com/problems/merge-two-sorted-lists/)
 */

object Code0021 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummyNode = ListNode(-1)
        var ptr = dummyNode
        var ptr1 = list1
        var ptr2 = list2

        while (ptr1 != null && ptr2 != null) {
            when {
                ptr1.`val` > ptr2.`val` -> {
                    ptr.next = ptr2
                    ptr = ptr2
                    ptr2 = ptr2.next
                }
                else -> {
                    ptr.next = ptr1
                    ptr = ptr1
                    ptr1 = ptr1.next
                }
            }
        }

        ptr1?.let { node ->
            ptr.next = ptr1
        }

        ptr2?.let { node ->
            ptr.next = ptr2
        }
        return dummyNode.next
    }

    fun runTest() {
        testCase1()
        testCase2()
        testCase3()
    }

    private fun testCase1() {
        Log.d("BrandonLog", "[Code0021-testCase1]: ")
        // Arrange
        val testNode1 = ListNode.generateFromList(arrayListOf(1, 2, 4))
        val testNode2 = ListNode.generateFromList(arrayListOf(1, 3, 4))
        val answer = arrayListOf(1,1,2,3,4,4)
        Log.d("BrandonLog", "input list1 = ${testNode1.flat()}")
        Log.d("BrandonLog", "input list2 = ${testNode2.flat()}")

        // Act
        val result = mergeTwoLists(testNode1, testNode2).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase2() {
        Log.d("BrandonLog", "[Code0021-testCase2]: ")
        // Arrange
        val testNode1: ListNode? = null
        val testNode2: ListNode? = null
        val answer: List<Int> = arrayListOf()
        Log.d("BrandonLog", "input list1 = ${testNode1.flat()}")
        Log.d("BrandonLog", "input list2 = ${testNode2.flat()}")

        // Act
        val result = mergeTwoLists(testNode1, testNode2).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase3() {
        Log.d("BrandonLog", "[Code0021-testCase3]: ")
        // Arrange
        val testNode1: ListNode? = null
        val testNode2: ListNode? = ListNode.generateFromList(arrayListOf(0))
        val answer: List<Int> = arrayListOf(0)
        Log.d("BrandonLog", "input list1 = ${testNode1.flat()}")
        Log.d("BrandonLog", "input list2 = ${testNode2.flat()}")

        // Act
        val result = mergeTwoLists(testNode1, testNode2).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }
}