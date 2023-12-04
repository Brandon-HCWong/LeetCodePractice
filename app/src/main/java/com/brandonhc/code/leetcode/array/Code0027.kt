package com.brandonhc.code.leetcode.array


/**
 * ## Easy
 * ## 27. Remove Element
 * ## [Website Link](https://leetcode.com/problems/remove-element/)
 */

object Code0027 {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var indexSlow = 0
        var indexFast = 0
        while (indexFast < nums.size) {
            if (nums[indexFast] != `val`) {
                nums[indexSlow] = nums[indexFast]
                indexSlow++
            }
            indexFast++
        }
        return indexSlow
    }
}
