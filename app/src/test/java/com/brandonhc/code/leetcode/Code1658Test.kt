package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code1658Test {
    @Test
    fun test_Case1() {
        // Arrange
        val nums = intArrayOf(1,1,4,2,3)
        val x = 5
        val answer = 2

        // Act
        val result = Code1658.minOperations(nums, x)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val nums = intArrayOf(5,6,7,8,9)
        val x = 4
        val answer = -1

        // Act
        val result = Code1658.minOperations(nums, x)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val nums = intArrayOf(3,2,20,1,1,3)
        val x = 10
        val answer = 5

        // Act
        val result = Code1658.minOperations(nums, x)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val nums = intArrayOf(3)
        val x = 3
        val answer = 1

        // Act
        val result = Code1658.minOperations(nums, x)

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case5() {
        // Arrange
        val nums = intArrayOf(3)
        val x = 2
        val answer = -1

        // Act
        val result = Code1658.minOperations(nums, x)

        // Assert
        println("[test_Case5] answer = $answer")
        println("[test_Case5] result = $result")
        Assert.assertEquals(answer, result)
    }
}