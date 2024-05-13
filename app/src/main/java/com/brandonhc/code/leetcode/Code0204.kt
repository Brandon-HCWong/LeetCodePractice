package com.brandonhc.code.leetcode

import kotlin.math.sqrt


/**
 * ## Medium
 * ## 204. Count Primes
 * ## [Website Link](https://leetcode.com/problems/count-primes/)
 */

object Code0204 {
    fun countPrimes(n: Int): Int {
        val isPrimeArray = BooleanArray(n) {
            when (it) {
                0,1 -> false
                else -> true
            }
        }
        val sqrtN = sqrt(n.toFloat()).toInt()
        for (num in 2 ..  sqrtN) {
            if (isPrimeArray[num]) {
                for (s in num*num until  n step num) {
                    isPrimeArray[s] = false
                }
            }
        }
        return isPrimeArray.count { it }
    }
}
