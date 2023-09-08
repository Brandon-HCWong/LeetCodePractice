package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.leetcode.array.Code0304
import org.junit.Assert
import org.junit.Test

/**
 * ## Medium
 * ## 19. Remove Nth Node From End of List
 * ## [Website Link](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */

class Code0304Test {
    @Test
    fun test_Case1() {
        // Arrange
        val matrix = arrayOf(
            intArrayOf(3,0,1,4,2),
            intArrayOf(5,6,3,2,1),
            intArrayOf(1,2,0,1,5),
            intArrayOf(4,1,0,1,7),
            intArrayOf(1,0,3,0,5)
        )
        val row1 = 2
        val col1 = 1
        val row2 = 4
        val col2 = 3
        val answer = 8

        // Act
        val result = Code0304(matrix).sumRegion(row1, col1, row2, col2)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val matrix = arrayOf(
            intArrayOf(3,0,1,4,2),
            intArrayOf(5,6,3,2,1),
            intArrayOf(1,2,0,1,5),
            intArrayOf(4,1,0,1,7),
            intArrayOf(1,0,3,0,5)
        )
        val row1 = 1
        val col1 = 1
        val row2 = 2
        val col2 = 2
        val answer = 11

        // Act
        val result = Code0304(matrix).sumRegion(row1, col1, row2, col2)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val matrix = arrayOf(
            intArrayOf(3,0,1,4,2),
            intArrayOf(5,6,3,2,1),
            intArrayOf(1,2,0,1,5),
            intArrayOf(4,1,0,1,7),
            intArrayOf(1,0,3,0,5)
        )
        val row1 = 1
        val col1 = 2
        val row2 = 2
        val col2 = 4
        val answer = 12

        // Act
        val result = Code0304(matrix).sumRegion(row1, col1, row2, col2)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val matrix = arrayOf(
            intArrayOf(-4,-5)
        )
        val row1 = 0
        val col1 = 1
        val row2 = 0
        val col2 = 1
        val answer = -5

        // Act
        val result = Code0304(matrix).sumRegion(row1, col1, row2, col2)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }
}