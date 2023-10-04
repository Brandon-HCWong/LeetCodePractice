package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.ListNode
import com.brandonhc.code.flat
import org.junit.Assert
import org.junit.Test

class Code0019Test {
    @Test
    fun test_Case1() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1,2,3,4,5))
        val n = 2
        val answer = arrayListOf(1,2,3,5)

        // Act
        val result = Code0019.removeNthFromEnd(head, n).flat()

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case2() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1))
        val n = 1
        val answer = arrayListOf<Int>()

        // Act
        val result = Code0019.removeNthFromEnd(head, n).flat()

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case3() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1,2))
        val n = 1
        val answer = arrayListOf(1)

        // Act
        val result = Code0019.removeNthFromEnd(head, n).flat()

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }
}