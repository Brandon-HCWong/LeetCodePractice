package com.brandonhc.code.utils

class DifferenceMatrix(private val matrix: Array<IntArray>) {

    constructor(array: IntArray) : this(arrayOf(array))

    private var differenceMatrixRowSize = matrix.size
    private var differenceMatrixColSize = matrix[0].size
    private var differenceMatrix: Array<IntArray> = Array(differenceMatrixRowSize) {
        IntArray(differenceMatrixColSize)
    }

    init {
        reset()
        print("differenceMatrix = \n")
        differenceMatrix.toList().forEach {
            print("${it.toList()}\n")
        }
    }

    fun reset() {
        differenceMatrix.also {
            for (rowIndex in 0 until differenceMatrixRowSize) {
                for (colIndex in 0 until differenceMatrixColSize) {
                    if (colIndex == 0) {
                        it[rowIndex][colIndex] = matrix[rowIndex][colIndex]
                    } else {
                        it[rowIndex][colIndex] = matrix[rowIndex][colIndex] -
                                matrix[rowIndex][colIndex - 1]
                    }
                }
            }
        }
    }

    fun addRegion(value: Int, row1: Int, col1: Int, row2: Int, col2: Int): DifferenceMatrix {
        val (largeRow, smallRow) = if (row1 > row2) {
            row1 to row2
        } else {
            row2 to row1
        }
        val (largeCol, smallCol) = if (col1 > col2) {
            col1 to col2
        } else {
            col2 to col1
        }
        for (rowIndex in smallRow .. largeRow) {
            differenceMatrix[rowIndex][smallCol] += value
            if (largeCol + 1 < differenceMatrixColSize) {
                differenceMatrix[rowIndex][largeCol + 1] -= value
            }
        }
        return this
    }

    fun subtractRegion(value: Int, row1: Int, col1: Int, row2: Int, col2: Int): DifferenceMatrix {
        val (largeRow, smallRow) = if (row1 > row2) {
            row1 to row2
        } else {
            row2 to row1
        }
        val (largeCol, smallCol) = if (col1 > col2) {
            col1 to col2
        } else {
            col2 to col1
        }
        for (rowIndex in smallRow .. largeRow) {
            differenceMatrix[rowIndex][smallCol] -= value
            if (largeCol + 1 < differenceMatrixColSize) {
                differenceMatrix[rowIndex][largeCol + 1] += value
            }
        }
        return this
    }

    fun generateResult(): Array<IntArray> {
        val resultMatrix: Array<IntArray> = Array(differenceMatrixRowSize) {
            IntArray(differenceMatrixColSize)
        }
        for (rowIndex in 0 until differenceMatrixRowSize) {
            for (colIndex in 0 until differenceMatrixColSize) {
                if (colIndex == 0) {
                    resultMatrix[rowIndex][colIndex] = differenceMatrix[rowIndex][colIndex]
                } else {
                    resultMatrix[rowIndex][colIndex] = differenceMatrix[rowIndex][colIndex] +
                            resultMatrix[rowIndex][colIndex - 1]
                }
            }
        }
        return resultMatrix
    }
}