package com.brandonhc.code.leetcode

import com.brandonhc.code.leetcode.Code0131
import org.junit.Assert
import org.junit.Test

class Code0131Test {
    @Test
    fun test_Case1() {
        // Arrange
        val chars = "aab"
        val answer = listOf(
            listOf("a","a","b"),
            listOf("aa","b"),
        )

        // Act
        val result = Code0131.partition(chars)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val chars = "a"
        val answer = listOf(
            listOf("a")
        )

        // Act
        val result = Code0131.partition(chars)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }
}