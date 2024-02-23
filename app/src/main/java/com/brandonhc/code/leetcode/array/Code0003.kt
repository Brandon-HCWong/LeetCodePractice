package com.brandonhc.code.leetcode.array


/**
 * ## Medium
 * ## 3. Longest Substring Without Repeating Characters
 * ## [Website Link](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 */

object Code0003 {
    fun lengthOfLongestSubstring(s: String): Int {
        val wHisMap = hashMapOf<Char, Int>()
        var leftIndex = 0
        var rightIndex = 0
        var resultLength = 0

        while (rightIndex < s.length) {
            val rightChar = s[rightIndex]
            rightIndex++

            wHisMap[rightChar] = wHisMap.getOrPut(rightChar) {0} + 1

            while ((wHisMap[rightChar] ?: 0) > 1) {
                val leftChar = s[leftIndex]
                leftIndex++
                wHisMap[leftChar]?.let {
                    wHisMap[leftChar] = it - 1
                }
            }

            if (rightIndex - leftIndex > resultLength) {
                resultLength = rightIndex - leftIndex
            }
        }
        return resultLength
    }
}
