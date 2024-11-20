package com.example.myfirstkotlinproject

import java.util.Scanner

fun main() {
    val day = Scanner(System.`in`).next().toIntOrNull() ?: 0 // if input is not a number then it will return 0
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        8 -> {
            println("Using multiple lines in when expression")
            println("Monday")
            println("Tuesday")
            println("Wednesday")
            println("...")
        }
        else -> println("Invalid day") // optional
    }
}