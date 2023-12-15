package com.brandonhc.code.leetcode.array


/**
 * ## Medium
 * ## 131. Palindrome Partitioning
 * ## [Website Link](https://leetcode.com/problems/palindrome-partitioning/)
 */


//Example 1:
//
//Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]

//Example 2:
//
//Input: s = "a"
//Output: [["a"]]

object Code0131 {
    fun partition(s: String): List<List<String>> {
        val result = ArrayList<ArrayList<String>>()
//        println("[$s] - start")
        for (pSize in 1 .. s.length) {
            val firstStr = s.substring(0, pSize)
//            println("firstStr = $firstStr, isValidPalindrome = ${isValidPalindrome(firstStr)}, pSize = $pSize")
            if (isValidPalindrome(firstStr)) {
                if (pSize != s.length) {
//                    println("subStr = ${s.substring(pSize, s.length)}")
                    val subResult = partition(s.substring(pSize, s.length))
                    subResult.forEach {
                        val tmpList = ArrayList(it)
                        tmpList.add(0, firstStr)
                        result.add(tmpList)
                    }
                } else {
//                    println("return firstStr")
                    result.add(arrayListOf(firstStr))
                }
            }
        }
//        println("[$s] - ${result}")
        return result
    }

    private fun isValidPalindrome(str: String): Boolean {
        if (str.isEmpty()) {
            return false
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
//        println("str = $str, length = ${str.length}, indexL = ($indexL, $indexR)")
        while (indexL >= 0 && indexR < str.length) {
            if (str[indexL] != str[indexR])
                return false
            indexL--
            indexR++
        }
        return true
    }
}
