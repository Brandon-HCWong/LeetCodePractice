package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode
import com.brandonhc.code.flat
import org.junit.Assert
import org.junit.Test

class Code0086Test {
    @Test
    fun test_Case1() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1,4,3,2,5,2))
        val x = 3
        val answer = arrayListOf(1,2,2,4,3,5)

        // Act
        val result = Code0086.partition(head, x).flat()

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }

    @Test
    fun test_Case2() {
        // Arrange
        val head = ListNode.generate(arrayListOf(2,1))
        val x = 2
        val answer = arrayListOf(1,2)

        // Act
        val result = Code0086.partition(head, x).flat()

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertArrayEquals(answer.toIntArray(), result.toIntArray())
    }
}