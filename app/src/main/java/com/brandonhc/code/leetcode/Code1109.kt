package com.brandonhc.code.leetcode


/**
 * ## Medium
 * ## 1109. Corporate Flight Bookings
 * ## [Website Link](https://leetcode.com/problems/corporate-flight-bookings/)
 */

class Code1109 {
    fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {
        val flightReservedSeatsArray = IntArray(n)
        val differenceArray = IntArray(n)

        bookings.forEach {
            val firstIndex = it[0] - 1
            val lastIndex = it[1] - 1
            val reservedSeatNum = it[2]

            differenceArray[firstIndex] += reservedSeatNum
            if (lastIndex + 1 < n) {
                differenceArray[lastIndex + 1] -= reservedSeatNum
            }
        }

        differenceArray.forEachIndexed { index, i ->
            if (index == 0) {
                flightReservedSeatsArray[index] = differenceArray[index]
            } else {
                flightReservedSeatsArray[index] = differenceArray[index] + flightReservedSeatsArray[index - 1]
            }
        }

        return flightReservedSeatsArray
    }
}
