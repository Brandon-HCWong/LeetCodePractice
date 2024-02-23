package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code0027Test {
    @Test
    fun test_Case1() {
        // Arrange
        val nums = intArrayOf(3,2,2,3)
        val removedVal = 3
        val answerNum = 2
        val answerArray = intArrayOf(2,2)

        // Act
        val resultNum = Code0027.removeElement(nums, removedVal)
        val resultArray = nums.copyOfRange(0, resultNum)

        // Assert
        println("[test_Case1] answer = $answerNum, ${answerArray.toList()}")
        println("[test_Case1] result = $resultNum, ${resultArray.toList()}")
        Assert.assertEquals(answerNum, resultNum)
        Assert.assertArrayEquals(answerArray, resultArray)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val nums = intArrayOf(0,1,2,2,3,0,4,2)
        val removedVal = 2
        val answerNum = 5
        val answerArray = intArrayOf(0,1,4,0,3)

        // Act
        val resultNum = Code0027.removeElement(nums, removedVal)
        val resultArray = nums.copyOfRange(0, resultNum)

        // Assert
        println("[test_Case2] answer = $answerNum, ${answerArray.toList()}")
        println("[test_Case2] result = $resultNum, ${resultArray.toList()}")
        Assert.assertEquals(answerNum, resultNum)
        Assert.assertArrayEquals(answerArray, resultArray)
    }
}