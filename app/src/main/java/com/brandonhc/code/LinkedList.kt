package com.brandonhc.code

import android.util.Log

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun generateFromList(list: List<Int>): ListNode? {
            if (list.isEmpty()) {
                return null
            }
            val dummyNode = ListNode(Int.MIN_VALUE)
            var currentNode = dummyNode
            list.forEach {
                val tempNode = ListNode(it)
                currentNode.next = tempNode
                currentNode = tempNode
            }
            return dummyNode.next
        }
    }
}

fun ListNode?.flat(): List<Int> {
    val result = arrayListOf<Int>()
    var tempNode: ListNode? = this
    while (tempNode != null) {
        result.add(tempNode.`val`)
        tempNode = tempNode.next
    }
    return result
}

fun Array<ListNode?>.flat(): List<List<Int>> {
    val result = arrayListOf<List<Int>>()
    for (item in this) {
        result.add(item.flat())
    }
    return result
}