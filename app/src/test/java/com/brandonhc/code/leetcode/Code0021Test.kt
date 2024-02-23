package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode
import com.brandonhc.code.flat
import org.junit.Assert
import org.junit.Test

class Code0021Test {
    @Test
    fun test_Case1() {
        // Arrange
        val testNode1 = ListNode.generate(arrayListOf(1, 2, 4))
        val testNode2 = ListNode.generate(arrayListOf(1, 3, 4))
        val answer = arrayListOf(1,1,2,3,4,4)

        // Act
        val result = Code0021.mergeTwoLists(testNode1, testNode2).flat()

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case2() {
        // Arrange
        val testNode1: ListNode? = null
        val testNode2: ListNode? = null
        val answer: List<Int> = arrayListOf()

        // Act
        val result = Code0021.mergeTwoLists(testNode1, testNode2).flat()

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case3() {
        // Arrange
        val testNode1: ListNode? = null
        val testNode2: ListNode? = ListNode.generate(arrayListOf(0))
        val answer: List<Int> = arrayListOf(0)

        // Act
        val result = Code0021.mergeTwoLists(testNode1, testNode2).flat()

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }
}