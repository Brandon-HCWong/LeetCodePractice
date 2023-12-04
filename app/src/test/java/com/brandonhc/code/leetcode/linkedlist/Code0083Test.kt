package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.ListNode
import com.brandonhc.code.flat
import org.junit.Assert
import org.junit.Test

class Code0083Test {
    @Test
    fun test_Case1() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1,1,2))
        val answer = arrayListOf(1,2)

        // Act
        val result = Code0083.deleteDuplicates(head).flat()

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case2() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1,1,2,3,3))
        val answer = arrayListOf(1,2,3)

        // Act
        val result = Code0083.deleteDuplicates(head).flat()

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }
}