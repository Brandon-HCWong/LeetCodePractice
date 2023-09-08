package com.brandonhc.code.leetcode.array


/**
 * ## Easy
 * ## 303. Range Sum Query - Immutable
 * ## [Website Link](https://leetcode.com/problems/range-sum-query-immutable/)
 */

class Code0303(nums: IntArray) {
    private var integralArray = IntArray(nums.size + 1).apply {
        nums.forEachIndexed { index, i ->
            this[index + 1] = this[index] + i
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        return integralArray[right + 1] -  integralArray[left]
    }
}
