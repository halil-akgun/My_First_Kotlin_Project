package com.myfirstkotlinproject

fun main() {

    // extension function
    fun Int.square(): Int = this * this
    println(5.square()) // 25

    fun Int.isEven(): Boolean = this % 2 == 0
    println(5.isEven()) // false

    fun Int.multiplyBy(factor: Int): Int = this * factor
    println(5.multiplyBy(3)) // 15

    // infix function
    infix fun Int.multiplyBy2(factor: Int): Int = this * factor
    println(5 multiplyBy2 3) // 15

    //         infix : X method Y
    // without infix : X.method(Y)
}