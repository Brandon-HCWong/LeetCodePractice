package com.brandonhc.code.leetcode.array


/**
 * ## Hard
 * ## 76. Minimum Window Substring
 * ## [Website Link](https://leetcode.com/problems/minimum-window-substring)
 */

object Code0076 {
    fun minWindow(s: String, t: String): String {
        val tMap = HashMap<Char, Int>()
        val windowMap = HashMap<Char, Int>()
        var validCount = 0
        var leftIndex = 0
        var rightIndex = 0
        var windowLeftIndex = 0
        var windowLength = Int.MAX_VALUE

        t.toCharArray().forEach {
            val value = tMap.getOrPut(it) {0}
            tMap[it] = value + 1
        }

        while (rightIndex < s.length) {
            val currentChar = s[rightIndex]
            if (tMap.containsKey(currentChar)) {
                val value = windowMap.getOrPut(currentChar) {0}
                windowMap[currentChar] = value + 1
                if (windowMap[currentChar] == tMap[currentChar]) {
                    validCount++
                }
            }
            rightIndex++

            while (validCount == tMap.size) {
                if (rightIndex - leftIndex < windowLength) {
                    windowLeftIndex = leftIndex
                    windowLength = rightIndex - leftIndex
                }

                val leftChar = s[leftIndex]
                leftIndex++

                if (tMap.containsKey(leftChar)) {
                    if (windowMap[leftChar] == tMap[leftChar]) {
                        validCount--
                    }
                    val value = windowMap.getOrPut(leftChar) {0}
                    windowMap[leftChar] = value - 1
                }
            }
        }
        return if ( windowLength == Int.MAX_VALUE ) {
            ""
        } else {
            s.substring(windowLeftIndex, windowLeftIndex + windowLength)
        }
    }
}
