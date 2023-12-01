package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.ListNode
import org.junit.Assert
import org.junit.Test

class Code0141Test {
    @Test
    fun test_Case1() {
        // Arrange
        val cyclePos = 1
        val head = ListNode.generateCycle(arrayListOf(3,2,0,-4), cyclePos)
        val answer = true

        // Act
        val result = Code0141.hasCycle(head)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val cyclePos = 0
        val head = ListNode.generateCycle(arrayListOf(1, 2), cyclePos)
        val answer = true

        // Act
        val result = Code0141.hasCycle(head)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val head = ListNode.generate(arrayListOf(1))
        val answer = false

        // Act
        val result = Code0141.hasCycle(head)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }
}