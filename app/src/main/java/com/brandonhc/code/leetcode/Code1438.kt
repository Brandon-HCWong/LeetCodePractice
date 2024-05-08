package com.brandonhc.code.leetcode

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


/**
 * ## Medium
 * ## 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
 * ## [Website Link](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit)
 */

object Code1438 {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        if (nums.isEmpty()) return 0
        var left = 0
        val minStack = ArrayDeque<Int>()
        val maxStack = ArrayDeque<Int>()
        minStack.addLast(0)
        maxStack.addLast(0)
        var result = 1
        for (right in 1 until nums.size) {
            // println("min ${minStack.map{nums[it]}}")
            // println("max ${maxStack.map{nums[it]}}")
            while (minStack.isNotEmpty() && nums[right] <= nums[minStack.last()])
                minStack.removeLast()
            minStack.addLast(right)

            while (maxStack.isNotEmpty() && nums[right] >= nums[maxStack.last()])
                maxStack.removeLast()
            maxStack.addLast(right)

            while (maxStack.isNotEmpty() && minStack.isNotEmpty() && nums[maxStack.first()] - nums[minStack.first()] > limit) {
                val index = if (maxStack.first() < minStack.first())
                    maxStack.removeFirst()
                else
                    minStack.removeFirst()
                left = index + 1
            }

            result = maxOf(result, right - left + 1)
        }
        return result
    }
}
