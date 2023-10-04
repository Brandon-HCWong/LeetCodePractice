package com.brandonhc.code.leetcode.array

import com.brandonhc.code.utils.IntegralMatrix


/**
 * ## Easy
 * ## 303. Range Sum Query - Immutable
 * ## [Website Link](https://leetcode.com/problems/range-sum-query-immutable/)
 */

class Code0303(nums: IntArray) {
    private var integralMatrix = IntegralMatrix(nums)

    fun sumRange(left: Int, right: Int): Int {
        return integralMatrix.sumRegion(0, left, 0, right)
    }
}
