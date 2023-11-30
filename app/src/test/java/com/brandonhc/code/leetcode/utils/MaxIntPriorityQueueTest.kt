package com.brandonhc.code.leetcode.utils

import com.brandonhc.code.datastructure.MaxIntPriorityQueue
import org.junit.Assert
import org.junit.Test

class MaxIntPriorityQueueTest {
    @Test
    fun test_Case1() {
        // Arrange
        val insertArray = intArrayOf(9, 6, 12, 3, 4, 6, 7)
        val answer = listOf(12, 9, 7, 6, 6, 4, 3)

        // Act
        val queue = MaxIntPriorityQueue(insertArray.size)
        insertArray.forEach {
            queue.insert(it)
        }
        val result = queue.getList()

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val insertArray = intArrayOf(6, 3, 7)
        val answer = listOf(7, 6, 3)

        // Act
        val queue = MaxIntPriorityQueue(insertArray.size)
        insertArray.forEach {
            queue.insert(it)
        }
        val result = queue.getList()

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }
}