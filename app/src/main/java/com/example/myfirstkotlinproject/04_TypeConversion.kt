package com.example.myfirstkotlinproject

fun main() {
    // int --> double
    val age = 30
    val ageInDouble = age.toDouble()
    println(ageInDouble) // output: 30.0

    // string --> int
    val ageStr = "30"
    val ageInInt = ageStr.toInt()
    println(ageInInt) // output: 30

    // string --> double
    val ageStr2 = "30.5"
    val ageInDouble2 = ageStr2.toDouble()
    println(ageInDouble2) // output: 30.5

    // toInt(): if string is not a number then it will throw an exception
    try {
        val ageStr3 = "30a"
        val ageInInt3 = ageStr3.toInt()
        println(ageInInt3)
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    // toIntOrNull(): if string is not a number then it will return null
    val ageStr4 = "30qwerty"
    val ageInInt4 = ageStr4.toIntOrNull()
    println(ageInInt4) // output: null
}