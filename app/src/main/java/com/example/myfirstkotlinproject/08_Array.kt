package com.example.myfirstkotlinproject

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5) // 1, 2, 3, 4, 5
    printArray(array)

    val array2 = arrayOfNulls<Int>(5) // null, null, null, null, null
    printArray(array2)

    val array3 = arrayOf(1, "Hello", 3.14, true) // 1, "Hello", 3.14, true
    printArray(array3)

    val array4 = Array<Int>(5) { 0 } // 0, 0, 0, 0, 0
    printArray(array4)

    val array5 = Array<Int>(5) { it * 2 } // 0, 2, 4, 6, 8
    // { it * 2 } : "it" means index
    printArray(array5)
}

fun <T> printArray(array: Array<T>) {
    for (i in array) {
        print("$i ")
    }
    println()
}