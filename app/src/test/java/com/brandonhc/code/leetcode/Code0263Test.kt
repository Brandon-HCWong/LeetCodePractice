package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code0263Test {
    @Test
    fun test_Case1() {
        // Arrange
        val n = 6
        val answer = true

        // Act
        val result = Code0263.isUgly(n)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val n = 1
        val answer = true

        // Act
        val result = Code0263.isUgly(n)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val n = 14
        val answer = false

        // Act
        val result = Code0263.isUgly(n)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }
}