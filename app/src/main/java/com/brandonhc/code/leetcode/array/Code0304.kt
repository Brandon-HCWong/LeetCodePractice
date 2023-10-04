package com.brandonhc.code.leetcode.array

import com.brandonhc.code.utils.IntegralMatrix


/**
 * ## Medium
 * ## 304. Range Sum Query 2D - Immutable
 * ## [Website Link](https://leetcode.com/problems/range-sum-query-2d-immutable/)
 */

class Code0304(val matrix: Array<IntArray>) {
    private var integralMatrix = IntegralMatrix(matrix)

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        return integralMatrix.sumRegion(row1, col1, row2, col2)
    }
}
