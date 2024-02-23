package com.brandonhc.code.leetcode


/**
 * ## Medium
 * ## 167. Two Sum II - Input Array Is Sorted
 * ## [Website Link](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
 */

object Code0167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var indexStart = 0
        var indexEnd = numbers.size - 1
        var sum = 0

        while (indexEnd - indexStart > 0) {
            sum = numbers[indexStart] + numbers[indexEnd]
            when(sum) {
                in target+1 .. Int.MAX_VALUE -> {
                    indexEnd--
                    continue
                }
                target -> {
                    return intArrayOf(indexStart+1, indexEnd+1)
                }
                else -> {
                    indexStart++
                    continue
                }
            }
        }
        return intArrayOf(-1, -1)
    }
}
