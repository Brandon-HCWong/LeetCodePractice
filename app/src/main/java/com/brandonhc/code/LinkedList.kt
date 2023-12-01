package com.brandonhc.code


class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun generate(list: List<Int>): ListNode? {
            if (list.isEmpty()) {
                return null
            }
            val nodeDummy = ListNode(Int.MIN_VALUE)
            var nodeCurrent = nodeDummy
            list.forEach {
                val nodeTemp = ListNode(it)
                nodeCurrent.next = nodeTemp
                nodeCurrent = nodeTemp
            }
            return nodeDummy.next
        }

        fun generateCycle(list: List<Int>, cycleStartIndex: Int): ListNode? {
            if (list.isEmpty() || cycleStartIndex < 0 || cycleStartIndex >= list.size) {
                return null
            }
            val nodeDummy = ListNode(Int.MIN_VALUE)
            var nodeCycleStart: ListNode? = null
            var nodeCurrent = nodeDummy
            list.forEachIndexed { index, value ->
                val nodeTemp = ListNode(value)
                nodeCurrent.next = nodeTemp
                nodeCurrent = nodeTemp
                if (index == cycleStartIndex) {
                    nodeCycleStart = nodeTemp
                }
            }
            nodeCurrent.next = nodeCycleStart
            return nodeDummy.next
        }
    }

    override fun toString(): String {
        return if (isCycle()) {
            findCycle()?.let {
                return "${flatUntilCycle(it)} : CycleNode = ${it.`val`}"
            }
            return "Something wrong"
        } else {
            flat().toString()
        }
    }
}

fun ListNode?.isCycle(): Boolean = findCycle() != null
fun ListNode?.findCycle(): ListNode? {
    if (this == null) {
        return null
    }

    var nodeSlow: ListNode? = this
    var nodeFast: ListNode? = this

    while (nodeFast?.next != null) {
        nodeSlow = nodeSlow?.next
        nodeFast = nodeFast.next?.next
        if (nodeSlow == nodeFast) {
            nodeSlow = this
            while (nodeSlow != nodeFast) {
                nodeSlow = nodeSlow?.next
                nodeFast = nodeFast?.next
            }
            return nodeSlow
        }
    }
    return null
}
fun ListNode?.flatUntilCycle(cycleStartNode: ListNode): List<Int> {
    val result = arrayListOf<Int>()
    var tempNode: ListNode? = this
    var countMeetCycle = 0
    while (tempNode != null) {
        if (tempNode == cycleStartNode) {
            countMeetCycle++
            if (countMeetCycle == 2) {
                break
            }
        }
        result.add(tempNode.`val`)
        tempNode = tempNode.next
    }
    return result
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

fun ListNode?.last(): ListNode? {
    var result: ListNode? = this
    while (result?.next != null) {
        result = result.next
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