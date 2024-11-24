package com.myfirstkotlinproject

fun main() {
    val array = arrayOf(3, 0, 5, 4, 9, 1) // 3, 0, 5, 4, 9, 1
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

    // get(): get element from array
    println(array[0]) // 3
    println(array.get(0)) // 3

    // set(): set element in array
    array2[1] = 10 // null, 10, null, null, null
    array2.set(2, 20) // null, 10, 20, null, null

    // contentToString(): convert array to string
    println(array2.contentToString())

    // size: get size of array
    println(array2.size) // 5
    println(array2.count()) // 5

    // isEmpty(): check if array is empty
    println(array2.isEmpty()) // false

    // isNotEmpty(): check if array is not empty
    println(array2.isNotEmpty()) // true

    // first(): get first element of array
    println(array.first()) // 3

    // last(): get last element of array
    println(array.last()) // 1

    // indexOf(): get index of element in array
    println(array.indexOf(3)) // 0

    // contains(): check if array contains element
    println(array.contains(3)) // true

    // min(): get minimum element of array
    println(array.minOrNull()) // 0

    // max(): get maximum element of array
    println(array.maxOrNull()) // 9

    // reversed(): reverse array
    println(array.reversedArray().contentToString()) // 1, 9, 4, 5, 0, 3

    // sorted(): sort array
    println(array.sortedArray().contentToString()) // 0, 1, 3, 4, 5, 9

    // sortedDescending(): sort array in descending order
    println(array.sortedArrayDescending().contentToString()) // 9, 5, 4, 3, 1, 0
}

// generic function
fun <T> printArray(array: Array<T>) {
    for (i in array) {
        print("$i ")
    }
    println()

    // use index in for loop
    for ((idx, i) in array.withIndex()) {
        println("index: $idx, value: $i")
    }
}