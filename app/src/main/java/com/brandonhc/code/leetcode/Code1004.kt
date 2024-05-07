package com.brandonhc.code.leetcode

import kotlin.math.max


/**
 * ## Medium
 * ## 1004. Max Consecutive Ones III
 * ## [Website Link](https://leetcode.com/problems/max-consecutive-ones-iii/)
 */

object Code1004 {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var leftIndex = 0
        var rightIndex = 0
        var result = 0
        var zeroCount = 0

        while (rightIndex < nums.size) {
            if (nums[rightIndex] == 0) {
                zeroCount++
            }
            while (zeroCount > k) {
                if (nums[leftIndex] == 0) {
                    zeroCount--
                }
                leftIndex++
            }
            result = max(rightIndex - leftIndex + 1, result)
            rightIndex++
        }
        return result
    }
}
