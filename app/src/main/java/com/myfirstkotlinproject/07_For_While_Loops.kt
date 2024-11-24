package com.myfirstkotlinproject

fun main() {
    // for loop
    for (i in 1..5) {
        print("$i ") // 1 2 3 4 5
    }
    println()
    for (i in 1 until 5) {
        print("$i ") // 1 2 3 4
    }
    println()
    for (i in 5 downTo 1) {
        print("$i ") // 5 4 3 2 1
    }
    println()
    for (i in 1..5 step 2) {
        print("$i ") // 1 3 5
    }
    println()
    for (i in 5 downTo 1 step 2) {
        print("$i ") // 5 3 1
    }
    println()

    // while loop
    var i = 1
    while (i <= 5) {
        print("$i ") // 1 2 3 4 5
        i++
    }
}