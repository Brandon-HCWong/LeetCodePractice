package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode

/**
 * ## Medium
 * ## 86. Partition List
 * ## [Website Link](https://leetcode.com/problems/partition-list/)
 */

object Code0086 {
    fun partition(head: ListNode?, x: Int): ListNode? {
        val dummyNodeLesser = ListNode(Int.MIN_VALUE)
        val dummyNodeLarger = ListNode(Int.MIN_VALUE)

        var ptrHead = head
        var ptrLarger = dummyNodeLarger
        var ptrLesser = dummyNodeLesser

        while (ptrHead != null) {
            if (ptrHead.`val` >= x) {
                ptrLarger.next = ptrHead
                ptrLarger = ptrHead
            } else {
                ptrLesser.next = ptrHead
                ptrLesser = ptrHead
            }
            val nextNode = ptrHead.next
            ptrHead.next = null
            ptrHead = nextNode
        }
        ptrLesser.next = dummyNodeLarger.next

        return dummyNodeLesser.next
    }
}