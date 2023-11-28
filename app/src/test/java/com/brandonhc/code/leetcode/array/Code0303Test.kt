package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code0303Test {
    @Test
    fun test_Case1() {
        // Arrange
        val nums = intArrayOf(-2,0,3,-5,2,-1)
        val left = 0
        val right = 2
        val answer = 1

        // Act
        val result = Code0303(nums).sumRange(left, right)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val nums = intArrayOf(-2,0,3,-5,2,-1)
        val left = 2
        val right = 5
        val answer = -1

        // Act
        val result = Code0303(nums).sumRange(left, right)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val nums = intArrayOf(-2,0,3,-5,2,-1)
        val left = 0
        val right = 5
        val answer = -3

        // Act
        val result = Code0303(nums).sumRange(left, right)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }
}