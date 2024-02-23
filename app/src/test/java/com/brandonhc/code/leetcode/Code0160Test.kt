package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode
import com.brandonhc.code.last
import com.brandonhc.code.leetcode.Code0160
import org.junit.Assert
import org.junit.Test

class Code0160Test {
    @Test
    fun test_Case1() {
        // Arrange
        val headA = ListNode.generate(arrayListOf(4, 1))
        val headB = ListNode.generate(arrayListOf(5, 6, 1))
        val answer = ListNode.generate(arrayListOf(8, 4, 5))
        headA?.last()?.next = answer
        headB?.last()?.next = answer
        println("[test_Case1] headA = $headA")
        println("[test_Case1] headB = $headB")

        // Act
        val result = Code0160.getIntersectionNode(headA, headB)

        // Assert
        println("[test_Case1] answer = $answer")
        println("[test_Case1] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case2() {
        // Arrange
        val headA = ListNode.generate(arrayListOf(1, 9, 1))
        val headB = ListNode.generate(arrayListOf(3))
        val answer = ListNode.generate(arrayListOf(2, 4))
        headA?.last()?.next = answer
        headB?.last()?.next = answer
        println("[test_Case2] headA = $headA")
        println("[test_Case2] headB = $headB")

        // Act
        val result = Code0160.getIntersectionNode(headA, headB)

        // Assert
        println("[test_Case2] answer = $answer")
        println("[test_Case2] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case3() {
        // Arrange
        val answer = ListNode.generate(arrayListOf(1))
        val headA = answer
        val headB = answer
        println("[test_Case3] headA = $headA")
        println("[test_Case3] headB = $headB")

        // Act
        val result = Code0160.getIntersectionNode(headA, headB)

        // Assert
        println("[test_Case3] answer = $answer")
        println("[test_Case3] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case4() {
        // Arrange
        val headA = ListNode.generate(arrayListOf(2, 6, 4))
        val headB = ListNode.generate(arrayListOf(1, 5))
        val answer: ListNode? = null
        println("[test_Case4] headA = $headA")
        println("[test_Case4] headB = $headB")

        // Act
        val result = Code0160.getIntersectionNode(headA, headB)

        // Assert
        println("[test_Case4] answer = $answer")
        println("[test_Case4] result = $result")
        Assert.assertEquals(answer, result)
    }

    @Test
    fun test_Case5() {
        // Arrange
        val answer = ListNode.generate(arrayListOf(3))
        val headA = answer
        val headB = ListNode.generate(arrayListOf(2))
        headB?.last()?.next = answer
        println("[test_Case5] headA = $headA")
        println("[test_Case5] headB = $headB")

        // Act
        val result = Code0160.getIntersectionNode(headA, headB)

        // Assert
        println("[test_Case5] answer = $answer")
        println("[test_Case5] result = $result")
        Assert.assertEquals(answer, result)
    }
}