package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.ListNode
import com.brandonhc.code.flat
import org.junit.Assert
import org.junit.Test

class Code0876Test {
    @Test
    fun test_Case1() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1,2,3,4,5))
        val answer = arrayListOf(3,4,5)

        // Act
        val result = Code0876.middleNode(head).flat()

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case2() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1,2,3,4,5,6))
        val x = 2
        val answer = arrayListOf(4,5,6)

        // Act
        val result = Code0876.middleNode(head).flat()

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }
}