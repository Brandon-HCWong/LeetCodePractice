package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode
import com.brandonhc.code.leetcode.Code0142
import org.junit.Assert
import org.junit.Test

class Code0142Test {
    @Test
    fun test_Case1() {
        // Arrange
        val cyclePos = 1
        val head = ListNode.generateCycle(arrayListOf(3,2,0,-4), cyclePos)
        val answer = 2

        // Act
        val result = Code0142.detectCycle(head)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = ${result?.`val`}")
        Assert.assertEquals(answer, result?.`val`)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val cyclePos = 0
        val head = ListNode.generateCycle(arrayListOf(1, 2), cyclePos)
        val answer = 1

        // Act
        val result = Code0142.detectCycle(head)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = ${result?.`val`}")
        Assert.assertEquals(answer, result?.`val`)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1))
        val answer: ListNode? = null

        // Act
        val result = Code0142.detectCycle(head)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }
}