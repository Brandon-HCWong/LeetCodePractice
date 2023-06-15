package com.brandonhc.code

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun generateFromList(list: List<Int>): ListNode? {
            if (list.isEmpty()) {
                return null
            }
            val dummyNode = ListNode(-1)
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

fun ListNode.flat(): List<Int> {
    val result = arrayListOf<Int>()
    var tempNode: ListNode? = this
    while (tempNode != null) {
        result.add(tempNode.`val`)
        tempNode = tempNode.next
    }
    return result
}