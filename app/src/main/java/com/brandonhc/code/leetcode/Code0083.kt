package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode

/**
 * ## Easy
 * ## 83. Remove Duplicates from Sorted List
 * ## [Website Link](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
 */

object Code0083 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var nodeSlow: ListNode? = head
        var nodeFast: ListNode? = head
        while (nodeFast != null) {
            if (nodeSlow?.`val` != nodeFast.`val`) {
                nodeSlow?.next = nodeFast
                nodeSlow = nodeFast
            }
            nodeFast = nodeFast.next
        }
        nodeSlow?.next = null
        return head
    }
}