package com.brandonhc.code.leetcode.linkedlist


/**
 * ## Easy
 * ## 303. Range Sum Query - Immutable
 * ## [Website Link](https://leetcode.com/problems/range-sum-query-immutable/)
 */

object Code0303 {
    var integralArray = intArrayOf()
    var nums: IntArray = intArrayOf()
        set(value) {
            integralArray = IntArray(value.size + 1).apply {
                value.forEachIndexed { index, i ->
                    this[index + 1] = this[index] + i
                }
            }
            field = value
        }

    fun sumRange(left: Int, right: Int): Int {
        return integralArray[right + 1] -  integralArray[left]
    }
}
