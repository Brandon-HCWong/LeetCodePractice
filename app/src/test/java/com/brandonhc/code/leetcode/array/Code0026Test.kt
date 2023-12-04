package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code0026Test {
    @Test
    fun test_Case1() {
        // Arrange
        val nums = intArrayOf(1,1,2)
        val answerNum = 2
        val answerArray = intArrayOf(1,2)

        // Act
        val resultNum = Code0026().removeDuplicates(nums)
        val resultArray = nums.copyOfRange(0, resultNum)

        // Assert
        println("[test_Case1] answer = $answerNum , ${answerArray.toList()}")
        println("[test_Case1] result = $resultNum, ${resultArray.toList()}")
        Assert.assertEquals(answerNum, resultNum)
        Assert.assertArrayEquals(answerArray, resultArray)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val answerNum = 5
        val answerArray = intArrayOf(0,1,2,3,4)

        // Act
        val resultNum = Code0026().removeDuplicates(nums)
        val resultArray = nums.copyOfRange(0, resultNum)

        // Assert
        println("[test_Case2] answer = $answerNum , ${answerArray.toList()}")
        println("[test_Case2] result = $resultNum, ${resultArray.toList()}")
        Assert.assertEquals(answerNum, resultNum)
        Assert.assertArrayEquals(answerArray, resultArray)
    }
}