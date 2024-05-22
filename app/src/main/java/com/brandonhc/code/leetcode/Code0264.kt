package com.brandonhc.code.leetcode


/**
 * ## Medium
 * ## 264. Ugly Number II
 * ## [Website Link](https://leetcode.com/problems/ugly-number-ii)
 */

object Code0264 {
    data class MultiplierProduct(
        val multiplier: Int,
        var ptr: Int,
        var product: Int
    )

    fun nthUglyNumber(n: Int): Int {
        val mpList = mutableListOf(
            MultiplierProduct(2, 1, 1),
            MultiplierProduct(3, 1, 1),
            MultiplierProduct(5, 1, 1)
        )
        var currentPtr = 1
        val productArray = IntArray(n+1)

        while (currentPtr <= n) {
            val minMp = mpList.minBy {
                it.product
            }
            productArray[currentPtr] = minMp.product
            mpList.forEach {
                if (it.product == productArray[currentPtr]) {
                    it.product = it.multiplier * productArray[it.ptr]
                    it.ptr++
                }
            }
            currentPtr++
        }
        return productArray[n]
    }
}
