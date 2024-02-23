package com.brandonhc.code.leetcode



/**
 * ## Medium
 * ## 438. Find All Anagrams in a String
 * ## [Website Link](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
 */

object Code0438 {
    fun findAnagrams(s: String, p: String): List<Int> {
        val pHisMap = hashMapOf<Char, Int>().apply {
            p.forEach {
                this[it] = this.getOrPut(it) { 0 } + 1
            }
        }
        val wHisMap = hashMapOf<Char, Int>()
        val resultList = mutableListOf<Int>()
        var rightIndex = 0
        var leftIndex = 0
        var validCount = 0

        while (rightIndex < s.length) {
            val rightChar = s[rightIndex]
            rightIndex++

            pHisMap[rightChar]?.let { pCount ->
                wHisMap[rightChar] = wHisMap.getOrPut(rightChar) {0} + 1
                wHisMap[rightChar]?.let { wCount ->
                    if (wCount == pCount) {
                        validCount ++
                    }
                }
            }

            while (validCount == pHisMap.size) {
                if (rightIndex - leftIndex == p.length) {
                    resultList.add(leftIndex)
                }

                val leftChar = s[leftIndex]
                leftIndex++

                wHisMap[leftChar]?.let { wCount ->
                    pHisMap[leftChar]?.let { pCount ->
                        if (wCount == pCount) {
                            validCount--
                        }
                    }
                    wHisMap[leftChar] = wCount - 1
                }
            }
        }

        return resultList
    }
}
