package com.brandonhc.code.leetcode


/**
 * ## Easy
 * ## 125. Valid Palindrome
 * ## [Website Link](https://leetcode.com/problems/valid-palindrome/)
 */

object Code0125 {
    fun isPalindrome(s: String): Boolean {
        val str = s.lowercase().filter {
            it.isLetterOrDigit()
        }
        var indexL = 0
        var indexR = 0
        when (str.length % 2 == 1) {
            true -> {
                indexL = str.length / 2
                indexR = str.length / 2
            }
            false -> {
                indexL = (str.length-1) / 2
                indexR = (str.length-1) / 2 + 1
            }
        }
        println("str = $str, length = ${str.length}, indexL = ($indexL, $indexR)")
        while (indexL >= 0 && indexR < str.length) {
            if (str[indexL] != str[indexR])
                return false
            indexL--
            indexR++
        }
        return true
    }
}
