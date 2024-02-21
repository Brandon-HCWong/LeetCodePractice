package com.brandonhc.code.leetcode.array

import org.junit.Assert
import org.junit.Test

class Code0438Test {
    @Test
    fun test_Case1() {
        // Arrange
        val content = "cbaebabacd"
        val permutationSource = "abc"
        val answer = arrayListOf(0, 6)

        // Act
        val result = Code0438.findAnagrams(content, permutationSource)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val content = "abab"
        val permutationSource = "ab"
        val answer = arrayListOf(0, 1, 2)

        // Act
        val result = Code0438.findAnagrams(content, permutationSource)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }
}