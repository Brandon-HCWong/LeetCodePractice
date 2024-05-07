package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code1004Test {
    @Test
    fun test_Case1() {
        // Arrange
        val nums = intArrayOf(1,1,1,0,0,0,1,1,1,1,0)
        val k = 2
        val answer = 6

        // Act
        val result = Code1004.longestOnes(nums, k)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val nums = intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1)
        val k = 3
        val answer = 10

        // Act
        val result = Code1004.longestOnes(nums, k)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val nums = intArrayOf(0, 0, 0, 0)
        val k = 0
        val answer = 0

        // Act
        val result = Code1004.longestOnes(nums, k)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val nums = intArrayOf(0)
        val k = 1
        val answer = 1

        // Act
        val result = Code1004.longestOnes(nums, k)

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case5() {
        // Arrange
        val nums = intArrayOf(0)
        val k = 0
        val answer = 0

        // Act
        val result = Code1004.longestOnes(nums, k)

        // Assert
        println("[test_Case5] answer = $answer")
        println("[test_Case5] result = $result")
        Assert.assertEquals(answer, result)
    }
}