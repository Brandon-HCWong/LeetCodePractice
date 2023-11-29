package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code1109Test {
    @Test
    fun test_Case1() {
        // Arrange
        val flightNum = 5
        // [first index, last index, added value]
        val bookings = arrayOf(
            intArrayOf(1,2,10),
            intArrayOf(2,3,20),
            intArrayOf(2,5,25)
        )
        val answer = intArrayOf(
            10,55,45,25,25
        )

        // Act
        val result = Code1109().corpFlightBookings(bookings, flightNum)

        // Assert
        println("[test_Case1] answer = ${answer.toList()}")
        println("[test_Case1] result = ${result.toList()}")
        Assert.assertArrayEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val flightNum = 2
        // [first index, last index, added value]
        val bookings = arrayOf(
            intArrayOf(1,2,10),
            intArrayOf(2,2,15)
        )
        val answer = intArrayOf(
            10,25
        )

        // Act
        val result = Code1109().corpFlightBookings(bookings, flightNum)

        // Assert
        println("[test_Case2] answer = ${answer.toList()}")
        println("[test_Case2] result = ${result.toList()}")
        Assert.assertArrayEquals(answer, result)
    }
}