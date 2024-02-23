package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code0005Test {
    @Test
    fun test_Case1() {
        // Arrange
        val chars = "babad"
        val answer = "bab"

        // Act
        val result = Code0005.longestPalindrome(chars)

        // Assert
        println("[test_Case1] answer = ${answer.toList()}")
        println("[test_Case1] result = ${result.toList()}")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val chars = "cbbd"
        val answer = "bb"

        // Act
        val result = Code0005.longestPalindrome(chars)

        // Assert
        println("[test_Case2] answer = ${answer.toList()}")
        println("[test_Case2] result = ${result.toList()}")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val chars = "a"
        val answer = "a"

        // Act
        val result = Code0005.longestPalindrome(chars)

        // Assert
        println("[test_Case3] answer = ${answer.toList()}")
        println("[test_Case3] result = ${result.toList()}")
        Assert.assertEquals(answer, result)
    }
}