package com.brandonhc.code.leetcode.linkedlist

import android.util.Log
import com.brandonhc.code.ListNode
import com.brandonhc.code.TestUtils
import com.brandonhc.code.flat
import java.util.PriorityQueue

/**
 * ## Hard
 * ## 23. Merge k Sorted Lists
 * ## [Website Link](https://leetcode.com/problems/merge-k-sorted-lists/)
 */


object Code0023 {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }

        val dummyNode = ListNode(Int.MIN_VALUE)
        var currentNode: ListNode = dummyNode
        val priorityQueue = PriorityQueue(Comparator<ListNode> { o1, o2 -> o1.`val` - o2.`val` })

        lists.forEach {
            it?.let { node ->
                priorityQueue.add(node)
            }
        }

        while (priorityQueue.isNotEmpty()) {
            priorityQueue.poll()?.let { node ->
                if (node.next != null) {
                    priorityQueue.add(node.next)
                }
                currentNode.next = node
                currentNode = currentNode.next!!
            }
        }
        currentNode.next = null
        return dummyNode.next
    }

    fun runTest() {
        testCase1()
        testCase2()
        testCase3()
        testCase4()
    }

    private fun testCase1() {
        Log.d("BrandonLog", "[Code0023-testCase1]:")
        // Arrange
        val testNode1 = ListNode.generateFromList(arrayListOf(1, 4, 5))
        val testNode2 = ListNode.generateFromList(arrayListOf(1, 3, 4))
        val testNode3 = ListNode.generateFromList(arrayListOf(2, 6))
        val input = arrayOf(testNode1, testNode2, testNode3)
        val answer = arrayListOf(1, 1, 2, 3, 4, 4, 5, 6)
        Log.d("BrandonLog", "input = ${input.flat()}")

        // Act
        val result = mergeKLists(input).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase2() {
        Log.d("BrandonLog", "[Code0023-testCase2]:")
        // Arrange
        val input = arrayOf<ListNode?>()
        val answer = listOf<Int>()
        Log.d("BrandonLog", "input = ${input.flat()}")

        // Act
        val result = mergeKLists(input).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase3() {
        Log.d("BrandonLog", "[Code0023-testCase3]:")
        // Arrange
        val input = arrayOf<ListNode?>(null)
        val answer = listOf<Int>()
        Log.d("BrandonLog", "input = ${input.flat()}")

        // Act
        val result = mergeKLists(input).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }

    private fun testCase4() {
        Log.d("BrandonLog", "[Code0023-testCase4]:")
        // Arrange
        val testNode1 = ListNode.generateFromList(arrayListOf(-2,-1,-1,-1))
        val testNode2: ListNode? = null
        val input = arrayOf(testNode1, testNode2)
        val answer = listOf(-2,-1,-1,-1)
        Log.d("BrandonLog", "input = ${input.flat()}")

        // Act
        val result = mergeKLists(input).flat()

        // Assert
        TestUtils.checkResult(result, answer)
    }
}