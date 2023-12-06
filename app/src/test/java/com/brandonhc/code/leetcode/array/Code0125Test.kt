package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code0125Test {
    @Test
    fun test_Case1() {
        // Arrange
        val chars = "A man, a plan, a canal: Panama"
        val answer = true

        // Act
        val result = Code0125.isPalindrome(chars)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val chars = "race a car"
        val answer = false

        // Act
        val result = Code0125.isPalindrome(chars)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val chars = " "
        val answer = true

        // Act
        val result = Code0125.isPalindrome(chars)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val chars = ".,"
        val answer = true

        // Act
        val result = Code0125.isPalindrome(chars)

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case5() {
        // Arrange
        val chars = "ab"
        val answer = false

        // Act
        val result = Code0125.isPalindrome(chars)

        // Assert
        println("[test_Case5] answer = $answer")
        println("[test_Case5] result = $result")
        Assert.assertEquals(answer, result)
    }
}