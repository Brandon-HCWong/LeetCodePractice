package com.brandonhc.code

import android.util.Log

object TestUtils {
    // Template
    private fun testCase() {
        // Arrange

        // Act

        // Assert
    }

    fun checkResult(result: List<Int>, answer: List<Int>) {
        Log.d("BrandonLog", "result = $result")
        Log.d("BrandonLog", "answer = $answer")
        when (answer == result) {
            true -> {
                Log.d("BrandonLog", "Passed.")
            }
            false -> {
                Log.d("BrandonLog", "Failed.")
            }
        }
    }
}