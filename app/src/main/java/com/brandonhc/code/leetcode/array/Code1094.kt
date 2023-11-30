package com.brandonhc.code.leetcode.array


/**
 * ## Medium
 * ## 1094. Car Pooling
 * ## [Website Link](https://leetcode.com/problems/car-pooling/)
 */

class Code1094 {
    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
        var finalDestination = 0

        // Find final destination
        trips.forEach {
            if (it[2] > finalDestination) {
                finalDestination = it[2]
            }
        }
        finalDestination++
        print("finalDestination = $finalDestination\n")

        // Initialize difference array
        val passengerDifferenceArray = IntArray(finalDestination)

        // Evaluating
        trips.forEach {
            passengerDifferenceArray[it[1]] += it[0]
            passengerDifferenceArray[it[2]] -= it[0]
        }
        print("passengerDifferenceArray = ${passengerDifferenceArray.toList()}\n")

        val resultArray = IntArray(finalDestination)
        passengerDifferenceArray.forEachIndexed { index, i ->
            if (index == 0) {
                resultArray[index] = passengerDifferenceArray[index]
            } else {
                resultArray[index] = passengerDifferenceArray[index] + resultArray[index - 1]
            }
        }
        print("resultArray = ${resultArray.toList()}\n")

        return (resultArray.find { it > capacity } != null).not()
    }
}
