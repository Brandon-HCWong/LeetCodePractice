package com.brandonhc.code.leetcode


/**
 * ## Easy
 * ## 263. Ugly Number
 * ## [Website Link](https://leetcode.com/problems/ugly-number)
 */

object Code0263 {
    fun isUgly(n: Int): Boolean {
        var result = n
        if (result <= 0) return false
        while (result.mod(2) == 0) {
            result /= 2
        }
        while (result.mod(3) == 0) {
            result /= 3
        }
        while (result.mod(5) == 0) {
            result /= 5
        }
        return result == 1
    }
}
