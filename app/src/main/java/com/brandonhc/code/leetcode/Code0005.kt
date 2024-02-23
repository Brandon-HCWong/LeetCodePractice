package com.brandonhc.code.leetcode


/**
 * ## Medium
 * ## 5. Longest Palindromic Substring
 * ## [Website Link](https://leetcode.com/problems/longest-palindromic-substring/description/)
 */

object Code0005 {
    fun longestPalindrome(s: String): String {
        var result = ""
        var oddP = ""
        var evenP = ""
        for (i in s.indices) {
            oddP = getPalindrome(s, i, i)
            if (oddP.length > result.length) {
                result = oddP
            }
            evenP = getPalindrome(s, i, i+1)
            if (evenP.length > result.length) {
                result = evenP
            }
        }
        return result
    }

    private fun getPalindrome(s: String, l: Int, r: Int): String {
        var indexL = l
        var indexR = r
        while (indexL >= 0 && indexR < s.length) {
            if (s[indexL] != s[indexR]) {
                break
            }
            indexL--
            indexR++
        }
        return s.substring(indexL+1, indexR)
    }
}
