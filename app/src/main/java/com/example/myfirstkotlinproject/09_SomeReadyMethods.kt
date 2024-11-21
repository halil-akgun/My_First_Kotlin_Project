package com.example.myfirstkotlinproject

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {

    // create random number
    for (i in 1..5) {
//        val randomNumber = (1..100).random()
        val randomNumber = Random.nextInt(1, 100)
        println("random number: $randomNumber")
    }


    val ceil = ceil(3.14) // 4.0
    val floor = floor(3.14) // 3.0
    val sqrt = sqrt(9.0) // 3.0
    val abs = abs(-3) // 3
    val max = max(3, 5) // 5
    val min = min(3, 5) // 3
    val pow = 3.0.pow(2.0) // 9

    println("ceil: $ceil")
    println("floor: $floor")
    println("sqrt: $sqrt")
    println("abs: $abs")
    println("max: $max")
    println("min: $min")
    println("pow: $pow")
}