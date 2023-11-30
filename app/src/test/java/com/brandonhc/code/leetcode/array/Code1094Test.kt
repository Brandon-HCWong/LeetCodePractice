package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code1094Test {
    @Test
    fun test_Case1() {
        // Arrange
        val capacity = 4
        // [first index, last index, added value]
        val trips = arrayOf(
            intArrayOf(2,1,5),
            intArrayOf(3,3,7)
        )
        val answer = false

        // Act
        val result = Code1094().carPooling(trips, capacity)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val capacity = 5
        // [first index, last index, added value]
        val trips = arrayOf(
            intArrayOf(2,1,5),
            intArrayOf(3,3,7)
        )
        val answer = true

        // Act
        val result = Code1094().carPooling(trips, capacity)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val capacity = 3
        // [first index, last index, added value]
        val trips = arrayOf(
            intArrayOf(2,1,5),
            intArrayOf(3,5,7)
        )
        val answer = true

        // Act
        val result = Code1094().carPooling(trips, capacity)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }
}