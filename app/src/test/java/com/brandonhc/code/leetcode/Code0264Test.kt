package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code0264Test {
    @Test
    fun test_Case1() {
        // Arrange
        val n = 10
        val answer = 12

        // Act
        val result = Code0264.nthUglyNumber(n)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val n = 1
        val answer = 1

        // Act
        val result = Code0264.nthUglyNumber(n)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }
}