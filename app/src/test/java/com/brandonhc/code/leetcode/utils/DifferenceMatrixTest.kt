package com.brandonhc.code.leetcode.utils

import com.brandonhc.code.utils.DifferenceMatrix
import org.junit.Assert
import org.junit.Test

class DifferenceMatrixTest {
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
        val row1 = 3
        val col1 = 3
        val row2 = 1
        val col2 = 1
        val answer = arrayOf(
            intArrayOf(3,0,1,4,2),
            intArrayOf(5,7,4,3,1),
            intArrayOf(1,3,1,2,5),
            intArrayOf(4,2,1,2,7),
            intArrayOf(1,0,3,0,5)
        )

        // Act
        val result = DifferenceMatrix(matrix)
            .addRegion(1, row1, col1, row2, col2)
            .generateResult()

        // Assert
        println("[test_Case1] answer =")
        for (index in result.indices) {
            println(" ${answer[index].toList()}")
        }
        println("[test_Case1] result =")
        for (index in result.indices) {
            println(" ${result[index].toList()}")
        }
        Assert.assertArrayEquals(answer, result)
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
        val row1 = 3
        val col1 = 4
        val row2 = 2
        val col2 = 0
        val answer = arrayOf(
            intArrayOf(3,0,1,4,2),
            intArrayOf(5,6,3,2,1),
            intArrayOf(0,1,-1,0,4),
            intArrayOf(3,0,-1,0,6),
            intArrayOf(1,0,3,0,5)
        )

        // Act
        val result = DifferenceMatrix(matrix)
            .subtractRegion(1, row1, col1, row2, col2)
            .generateResult()

        // Assert
        println("[test_Case2] answer =")
        for (index in result.indices) {
            println(" ${answer[index].toList()}")
        }
        println("[test_Case2] result =")
        for (index in result.indices) {
            println(" ${result[index].toList()}")
        }
        Assert.assertArrayEquals(answer, result)
    }
}