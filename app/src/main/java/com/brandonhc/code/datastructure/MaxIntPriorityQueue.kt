package com.brandonhc.code.datastructure

class MaxIntPriorityQueue (capacity: Int){
    /**
     * We implement a priority queue using a binary heap and ignore the first element for convenience.
     */
    private val queue = Array(capacity + 1) { Int.MIN_VALUE }
    private var currentSize: Int = 0
    private val lastIndex: Int
        get() = currentSize
    private val firstIndex: Int = 1

    fun getList(): List<Int> {
        val list = ArrayList<Int>()
        while (currentSize > 0) {
            val beforeList = queue.copyOfRange(firstIndex, lastIndex + 1).asList()
            println("[getList] beforeList = $beforeList")
            getAndDeleteMax()?.let {
                list.add(it)
            }
            val afterList = queue.copyOfRange(firstIndex, lastIndex + 1).asList()
            println("[getList] afterList = $afterList")
        }
        return list
    }

    fun getSize() = currentSize

    fun insert(value: Int) {
        currentSize ++
        queue[lastIndex] = value
        swim(lastIndex)
    }

    fun getMax(): Int {
        return if (currentSize > 0) {
            queue[firstIndex]
        } else {
            Int.MIN_VALUE
        }
    }

    fun getAndDeleteMax(): Int? {
        return if (currentSize > 0) {
            val maxValue = queue[firstIndex]
            queue[firstIndex] = queue[lastIndex]
            queue[lastIndex] = Int.MIN_VALUE
            currentSize--
            sink(firstIndex)
            maxValue
        } else {
            null
        }
    }

    private fun swim(i: Int) {
        var index = i
        while (index in firstIndex + 1 ..  lastIndex && queue[index] > queue[getParentIndex(index)]) {
            swap(getParentIndex(index), index)
            index = getParentIndex(index)
        }
    }

    private fun sink(i: Int) {
        var index = i
        println("[sink] currentSize = $currentSize")
        val beforeList = queue.copyOfRange(firstIndex, lastIndex + 1).asList()
        println("[sink] beforeList = $beforeList")
        while (index in firstIndex until  currentSize) {
            println("[sink] index = $index")
            var maxIndex = getLeftNodeIndex(index)

            if (maxIndex > currentSize) {
                break
            }

            val rightIndex = getRightNodeIndex(index)

            if (rightIndex <= currentSize && queue[rightIndex] > queue[maxIndex]) {
                maxIndex = rightIndex
            }

            if (queue[index] > queue[maxIndex]) {
                break
            }

            println("[sink] swap = ($maxIndex, $index)")
            swap(maxIndex, index)
            index = maxIndex
            val sinkList = queue.copyOfRange(firstIndex, lastIndex + 1).asList()
            println("[sink] sinkList = $sinkList")
        }
    }

    private fun swap(firstIndex: Int, secondIndex: Int) {
        val tempValue = queue[firstIndex]
        queue[firstIndex] = queue[secondIndex]
        queue[secondIndex] = tempValue
    }

    private fun getParentIndex(index: Int): Int {
        return index / 2
    }

    private fun getLeftNodeIndex(index: Int): Int {
        return index * 2
    }

    private fun getRightNodeIndex(index: Int): Int {
        return index * 2 + 1
    }
}