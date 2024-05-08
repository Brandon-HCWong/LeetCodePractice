package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code1438Test {
    @Test
    fun test_Case1() {
        // Arrange
        val nums = intArrayOf(8,2,4,7)
        val limit = 4
        val answer = 2

        // Act
        val result = Code1438.longestSubarray(nums, limit)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val nums = intArrayOf(10,1,2,4,7,2)
        val limit = 5
        val answer = 4

        // Act
        val result = Code1438.longestSubarray(nums, limit)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val nums = intArrayOf(4,2,2,2,4,4,2,2)
        val limit = 0
        val answer = 3

        // Act
        val result = Code1438.longestSubarray(nums, limit)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val nums = intArrayOf(4)
        val limit = 0
        val answer = 1

        // Act
        val result = Code1438.longestSubarray(nums, limit)

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case5() {
        // Arrange
        val nums = intArrayOf(2)
        val limit = 1
        val answer = 1

        // Act
        val result = Code1438.longestSubarray(nums, limit)

        // Assert
        println("[test_Case5] answer = $answer")
        println("[test_Case5] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case6() {
        // Arrange
        val nums = intArrayOf(2,2,2,4,4,2,5,5,5,5,5,2)
        val limit = 2
        val answer = 6

        // Act
        val result = Code1438.longestSubarray(nums, limit)

        // Assert
        println("[test_Case6] answer = $answer")
        println("[test_Case6] result = $result")
        Assert.assertEquals(answer, result)
    }
}