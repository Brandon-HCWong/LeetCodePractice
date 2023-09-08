package com.brandonhc.code.leetcode.array


/**
 * ## Medium
 * ## 304. Range Sum Query 2D - Immutable
 * ## [Website Link](https://leetcode.com/problems/range-sum-query-2d-immutable/)
 */

class Code0304(val matrix: Array<IntArray>) {
    private var integralMatrixRowSize = matrix.size + 1
    private var integralMatrixColSize = matrix[0].size + 1
    private var integralMatrix: Array<IntArray> = Array(integralMatrixRowSize) {
        IntArray(integralMatrixColSize)
    }.also {
        for (rowIndex in 1 until integralMatrixRowSize) {
            for (colIndex in 1 until integralMatrixColSize) {
                it[rowIndex][colIndex] = matrix[rowIndex-1][colIndex-1] +
                        it[rowIndex-1][colIndex] +
                        it[rowIndex][colIndex-1] -
                        it[rowIndex-1][colIndex-1]
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        return integralMatrix[row1][col1] -
                integralMatrix[row1][col2+1] -
                integralMatrix[row2+1][col1] +
                integralMatrix[row2+1][col2+1]
    }
}
