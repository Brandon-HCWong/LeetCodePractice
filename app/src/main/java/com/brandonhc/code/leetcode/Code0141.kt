package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode

/**
 * ## Easy
 * ## 141. Linked List Cycle
 * ## [Website Link](https://leetcode.com/problems/linked-list-cycle/)
 */

object Code0141 {
    fun hasCycle(head: ListNode?): Boolean {
        var ptrSlow: ListNode? = head?.next
        var ptrFast: ListNode? = head?.next?.next
        while(ptrFast != null) {
            if (ptrSlow == ptrFast) {
                return true
            }
            ptrSlow = ptrSlow?.next
            ptrFast = ptrFast.next?.next
        }
        return false
    }
}