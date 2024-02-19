package com.brandonhc.code.leetcode.array



/**
 * ## Medium
 * ## 567. Permutation in String
 * ## [Website Link](https://leetcode.com/problems/permutation-in-string)
 */

object Code0567 {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val permutationMap = HashMap<Char, Int>()
        val windowMap = HashMap<Char, Int>()
        var validCount = 0
        var leftIndex = 0
        var rightIndex = 0

        s1.toCharArray().forEach {
            permutationMap[it] = permutationMap.getOrPut(it) {0} + 1
        }

        while (rightIndex < s2.length) {
            val rightChar = s2[rightIndex]
            rightIndex++

            if (permutationMap.containsKey(rightChar)) {
                windowMap[rightChar] = windowMap.getOrPut(rightChar) {0} + 1
                if (windowMap[rightChar] == permutationMap[rightChar]) {
                    validCount++
                }
            }

            while (rightIndex - leftIndex >= s1.length) {
                if (validCount == permutationMap.size) {
                    return true
                }

                val leftChar = s2[leftIndex]
                leftIndex++

                if (permutationMap.containsKey(leftChar)) {
                    windowMap[leftChar]?.let { value ->
                        if (value == permutationMap.getOrDefault(leftChar, -1)) {
                            validCount--
                        }
                        windowMap[leftChar] = value - 1
                    }
                }
            }
        }
        return false
    }
}
