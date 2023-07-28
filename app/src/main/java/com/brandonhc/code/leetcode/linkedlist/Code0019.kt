package com.brandonhc.code.leetcode.linkedlist

import com.brandonhc.code.ListNode

/**
 * ## Medium
 * ## 19. Remove Nth Node From End of List
 * ## [Website Link](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
 */

object Code0019 {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val nodeDummy = ListNode(Int.MIN_VALUE).apply {
            next = head
        }
        var nodeFast: ListNode? = nodeDummy
        var nodeSlow: ListNode? = nodeDummy

        // Move FastNode forward by n steps.
        for (step in 1..n) {
            nodeFast = nodeFast?.next
        }

        // Move both nodes forward until end reached.
        while (nodeFast?.next != null) {
            nodeSlow = nodeSlow?.next
            nodeFast = nodeFast.next
        }

        // Remove Nth node.
        val nextNode = nodeSlow?.next?.next
        nodeSlow?.next?.next = null
        nodeSlow?.next = nextNode

        return nodeDummy.next
    }
}