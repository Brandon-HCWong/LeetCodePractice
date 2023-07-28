package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.ListNode

/**
 * ## Easy
 * ## 876. Middle of the Linked List
 * ## [Website Link](https://leetcode.com/problems/middle-of-the-linked-list/)
 */

object Code0876 {
    fun middleNode(head: ListNode?): ListNode? {
        val nodeDummy = ListNode(Int.MIN_VALUE).apply {
            next = head
        }
        var nodeSlow: ListNode? = nodeDummy
        var nodeFast: ListNode? = nodeDummy

        while (nodeFast != null) {
            nodeSlow = nodeSlow?.next
            nodeFast = nodeFast.next?.next
        }

        return nodeSlow
    }
}