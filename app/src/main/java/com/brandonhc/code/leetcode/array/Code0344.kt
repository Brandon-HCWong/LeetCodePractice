package com.brandonhc.code.leetcode.array


/**
 * ## Easy
 * ## 344. Reverse String
 * ## [Website Link](https://leetcode.com/problems/reverse-string/)
 */

object Code0344 {
    fun reverseString(s: CharArray): Unit {
        var iLeft = 0
        var iRight =  s.size - 1
        while (iLeft < iRight) {
            val char = s[iLeft]
            s[iLeft] = s[iRight]
            s[iRight] = char
            iLeft++
            iRight--
        }
    }
}
