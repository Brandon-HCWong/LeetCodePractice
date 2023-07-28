package com.brandonhc.code.leetcode.linkedlist

import android.util.Log
import com.brandonhc.code.ListNode

/**
 * ## Medium
 * ## 142. Linked List Cycle II
 * ## [Website Link](https://leetcode.com/problems/linked-list-cycle-ii/)
 */

object Code0142 {
    fun detectCycle(head: ListNode?): ListNode? {
        var fastNode = head
        var slowNode = head
        while (fastNode?.next != null) {
            slowNode = slowNode?.next
            fastNode = fastNode.next?.next
            if (slowNode == fastNode) {
                slowNode = head
                while (slowNode != fastNode) {
                    slowNode = slowNode?.next
                    fastNode = fastNode?.next
                }
                return slowNode
            }
        }
        return null
    }
}