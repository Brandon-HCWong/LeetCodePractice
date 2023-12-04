package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code0167Test {
    @Test
    fun test_Case1() {
        // Arrange
        val nums = intArrayOf(2,7,11,15)
        val target = 9
        val answerArray = intArrayOf(1,2)

        // Act
        val result = Code0167.twoSum(nums, target)

        // Assert
        println("[test_Case1] answer = ${answerArray.toList()}")
        println("[test_Case1] result = ${result.toList()}")
        Assert.assertArrayEquals(answerArray, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val nums = intArrayOf(2,3,4)
        val target = 6
        val answerArray = intArrayOf(1,3)

        // Act
        val result = Code0167.twoSum(nums, target)

        // Assert
        println("[test_Case2] answer = ${answerArray.toList()}")
        println("[test_Case2] result = ${result.toList()}")
        Assert.assertArrayEquals(answerArray, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val nums = intArrayOf(-1,0)
        val target = -1
        val answerArray = intArrayOf(1,2)

        // Act
        val result = Code0167.twoSum(nums, target)

        // Assert
        println("[test_Case3] answer = ${answerArray.toList()}")
        println("[test_Case3] result = ${result.toList()}")
        Assert.assertArrayEquals(answerArray, result)
    }
}