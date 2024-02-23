package com.brandonhc.code.leetcode


/**
 * ## Easy
 * ## 26. Remove Duplicates from Sorted Array
 * ## [Website Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
 */

class Code0026 {
    fun removeDuplicates(nums: IntArray): Int {
        var indexSlow = 0
        var indexFast = 0
        while (indexFast < nums.size) {
            if (nums[indexSlow] != nums[indexFast]) {
                indexSlow++
                nums[indexSlow] = nums[indexFast]
            }
            indexFast++
        }
        return indexSlow + 1
    }
}
