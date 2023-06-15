package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */

object LeetCode0021 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummyNode = ListNode(-1)
        var ptr = dummyNode
        var ptr1 = list1
        var ptr2 = list2

        while (ptr1 != null && ptr2 != null) {
            when {
                ptr1.`val` > ptr2.`val` -> {
                    ptr.next = ptr2
                    ptr = ptr2
                    ptr2 = ptr2.next
                }
                else -> {
                    ptr.next = ptr1
                    ptr = ptr1
                    ptr1 = ptr1.next
                }
            }
        }

        ptr1?.let { node ->
            ptr.next = ptr1
        }

        ptr2?.let { node ->
            ptr.next = ptr2
        }
        return dummyNode.next
    }
}