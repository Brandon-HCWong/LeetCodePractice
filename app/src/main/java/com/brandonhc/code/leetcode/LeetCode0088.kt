package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode

/**
 * https://leetcode.com/problems/partition-list/
 */

object LeetCode0088 {
    fun partition(head: ListNode?, x: Int): ListNode? {
        val dummyNodeLesser = ListNode(Int.MIN_VALUE)
        val dummyNodeLarger = ListNode(Int.MIN_VALUE)

        var ptrHead = head
        var ptrLarger = dummyNodeLarger
        var ptrLesser = dummyNodeLesser

        while (ptrHead != null) {
            if (ptrHead.`val` >= x) {
                val largerNode = ListNode(ptrHead.`val`)
                ptrLarger.next = largerNode
                ptrLarger = largerNode
            } else {
                val lesserNode = ListNode(ptrHead.`val`)
                ptrLesser.next = lesserNode
                ptrLesser = lesserNode
            }
            ptrHead = ptrHead.next
        }

        dummyNodeLarger.next?.let {
            if (it.`val` != Int.MIN_VALUE) {
                ptrLesser.next = it
            }
        }

        return dummyNodeLesser.next
    }
}