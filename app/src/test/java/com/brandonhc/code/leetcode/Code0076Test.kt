package com.brandonhc.code.leetcode

import com.brandonhc.code.leetcode.Code0076
import org.junit.Assert
import org.junit.Test

class Code0076Test {
    @Test
    fun test_Case1() {
        // Arrange
        val input = "ADOBECODEBANC"
        val pattern = "ABC"
        val answer = "BANC"

        // Act
        val result = Code0076.minWindow(input, pattern)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val input = "a"
        val pattern = "a"
        val answer = "a"

        // Act
        val result = Code0076.minWindow(input, pattern)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val input = "a"
        val pattern = "aa"
        val answer = ""

        // Act
        val result = Code0076.minWindow(input, pattern)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val input = "ADOBECODEB"
        val pattern = "ABC"
        val answer = "ADOBEC"

        // Act
        val result = Code0076.minWindow(input, pattern)

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertEquals(answer, result)
    }
}