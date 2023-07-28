package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.ListNode
import com.brandonhc.code.flat
import org.junit.Assert
import org.junit.Test

class Code0023Test {
    @Test
    fun test_Case1() {
        // Arrange
        val testNode1 = ListNode.generate(arrayListOf(1, 4, 5))
        val testNode2 = ListNode.generate(arrayListOf(1, 3, 4))
        val testNode3 = ListNode.generate(arrayListOf(2, 6))
        val input = arrayOf(testNode1, testNode2, testNode3)
        val answer = arrayListOf(1, 1, 2, 3, 4, 4, 5, 6)

        // Act
        val result = Code0023.mergeKLists(input).flat()

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case2() {
        // Arrange
        val input = arrayOf<ListNode?>()
        val answer = listOf<Int>()

        // Act
        val result = Code0023.mergeKLists(input).flat()

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case3() {
        // Arrange
        val input = arrayOf<ListNode?>(null)
        val answer = listOf<Int>()

        // Act
        val result = Code0023.mergeKLists(input).flat()

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case4() {
        // Arrange
        val testNode1 = ListNode.generate(arrayListOf(-2,-1,-1,-1))
        val testNode2: ListNode? = null
        val input = arrayOf(testNode1, testNode2)
        val answer = listOf(-2,-1,-1,-1)

        // Act
        val result = Code0023.mergeKLists(input).flat()

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }
}