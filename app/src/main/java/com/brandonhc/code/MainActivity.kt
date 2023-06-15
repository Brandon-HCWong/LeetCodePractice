package com.brandonhc.code

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.brandonhc.code.leetcode.LeetCode0088
import com.brandonhc.code.ui.theme.CodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val testNode1 = ListNode.generateFromList(arrayListOf(1, 2, 4))
        val testNode2 = ListNode.generateFromList(arrayListOf(1, 3, 4))
        val testNode3 = ListNode.generateFromList(arrayListOf(1,4,3,2,5,2))
        val testNode4 = ListNode.generateFromList(arrayListOf(-4,0,9,9,-3,-1,7,-8,5,-9,-2,-4,1,2,0,7,7,-5,-2,6,7,6,-9,1))
        Log.d("BrandonLog", "[MainActivity-onResume]: Input = ${testNode3?.flat()}")
        Log.d("BrandonLog", "[MainActivity-onResume]: Result = ${LeetCode0088.partition(testNode3, 3)?.flat()}")
        Log.d("BrandonLog", "[MainActivity-onResume]: Input = ${testNode4?.flat()}")
        Log.d("BrandonLog", "[MainActivity-onResume]: Result = ${LeetCode0088.partition(testNode4, -5)?.flat()}")
        // [-8,-9,-9,-4,0,9,9,-3,-1,7,5,-2,-4,1,2,0,7,7,-5,-2,6,7,6,1]
        // [-8, -9, -9, -4, 0, 9, 9, -3, -1, 7, 5, -2, -4, 1, 2, 0, 7, 7, -5, -2, 6, 7, 6, 1]
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodeTheme {
        Greeting("Android")
    }
}