package com.brandonhc.code.leetcode

import com.brandonhc.code.leetcode.Code0567
import org.junit.Assert
import org.junit.Test

class Code0567Test {
    @Test
    fun test_Case1() {
        // Arrange
        val content = "eidbaooo"
        val permutationSource = "ab"
        val answer = true

        // Act
        val result = Code0567.checkInclusion(permutationSource, content)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val content = "eidboaoo"
        val permutationSource = "ab"
        val answer = false

        // Act
        val result = Code0567.checkInclusion(permutationSource, content)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val content = ""
        val permutationSource = "ab"
        val answer = false

        // Act
        val result = Code0567.checkInclusion(permutationSource, content)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val content = "dcda"
        val permutationSource = "adc"
        val answer = true

        // Act
        val result = Code0567.checkInclusion(permutationSource, content)

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case5() {
        // Arrange
        val content = "ainwkckifykxlribaypk"
        val permutationSource = "ky"
        val answer = true

        // Act
        val result = Code0567.checkInclusion(permutationSource, content)

        // Assert
        println("[test_Case5] answer = $answer")
        println("[test_Case5] result = $result")
        Assert.assertEquals(answer, result)
    }
}