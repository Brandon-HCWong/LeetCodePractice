package com.brandonhc.code.leetcode

import com.brandonhc.code.ListNode
import java.util.PriorityQueue

/**
 * ## Hard
 * ## 23. Merge k Sorted Lists
 * ## [Website Link](https://leetcode.com/problems/merge-k-sorted-lists/)
 */


object Code0023 {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) {
            return null
        }

        val dummyNode = ListNode(Int.MIN_VALUE)
        var currentNode: ListNode = dummyNode
        val priorityQueue = PriorityQueue(Comparator<ListNode> { o1, o2 -> o1.`val` - o2.`val` })

        lists.forEach {
            it?.let { node ->
                priorityQueue.add(node)
            }
        }

        while (priorityQueue.isNotEmpty()) {
            priorityQueue.poll()?.let { node ->
                if (node.next != null) {
                    priorityQueue.add(node.next)
                }
                currentNode.next = node
                currentNode = currentNode.next!!
            }
        }
        currentNode.next = null
        return dummyNode.next
    }
}