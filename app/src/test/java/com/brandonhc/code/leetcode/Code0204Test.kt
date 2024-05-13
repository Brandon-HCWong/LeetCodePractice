package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code0204Test {
    @Test
    fun test_Case1() {
        // Arrange
        val n = 10
        val answer = 4

        // Act
        val result = Code0204.countPrimes(n)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val n = 0
        val answer = 0

        // Act
        val result = Code0204.countPrimes(n)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val n = 1
        val answer = 0

        // Act
        val result = Code0204.countPrimes(n)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }
}