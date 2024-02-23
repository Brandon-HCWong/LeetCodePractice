package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code0003Test {
    @Test
    fun test_Case1() {
        // Arrange
        val chars = "abcabcbb"
        val answer = 3

        // Act
        val result = Code0003.lengthOfLongestSubstring(chars)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val chars = "bbbbb"
        val answer = 1

        // Act
        val result = Code0003.lengthOfLongestSubstring(chars)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val chars = "pwwkew"
        val answer = 3

        // Act
        val result = Code0003.lengthOfLongestSubstring(chars)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }
}