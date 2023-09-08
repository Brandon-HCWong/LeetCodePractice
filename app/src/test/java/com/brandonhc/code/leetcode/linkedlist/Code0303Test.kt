package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.leetcode.array.Code0303
import org.junit.Assert
import org.junit.Test

/**
 * ## Medium
 * ## 19. Remove Nth Node From End of List
 * ## [Website Link](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */

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