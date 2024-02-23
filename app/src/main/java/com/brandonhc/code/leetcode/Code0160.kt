package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode

/**
 * ## Easy
 * ## 160. Intersection of Two Linked Lists
 * ## [Website Link](https://leetcode.com/problems/intersection-of-two-linked-lists/)
 */

object Code0160 {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var ptr1: ListNode? = headA
        var ptr2: ListNode? = headB
        while (ptr1 != ptr2) {
            ptr1 = if (ptr1 != null) {
                ptr1.next
            } else {
                headB
            }
            ptr2 = if (ptr2 != null) {
                ptr2.next
            } else {
                headA
            }
        }
        return ptr1
    }
}