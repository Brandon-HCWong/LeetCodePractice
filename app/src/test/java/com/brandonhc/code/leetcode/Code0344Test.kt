package com.brandonhc.code.leetcode

import org.junit.Assert
import org.junit.Test

class Code0344Test {
    @Test
    fun test_Case1() {
        // Arrange
        val chars = "hello".toCharArray()
        val answer = "olleh".toCharArray()

        // Act
        Code0344.reverseString(chars)

        // Assert
        println("[test_Case1] answer = ${answer.toList()}")
        println("[test_Case1] result = ${chars.toList()}")
        Assert.assertArrayEquals(answer, chars)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val chars = "Hannah".toCharArray()
        val answer = "hannaH".toCharArray()

        // Act
        Code0344.reverseString(chars)

        // Assert
        println("[test_Case2] answer = ${answer.toList()}")
        println("[test_Case2] result = ${chars.toList()}")
        Assert.assertArrayEquals(answer, chars)
    }
}