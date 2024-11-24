package com.myfirstkotlinproject

fun main() {

    fun greet() {
        println("Hello World")
    }
    greet()

    fun printName(name: String) {
        println(name)
    }
    printName("John")

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    println(sum(10, 20))

    // overloaded function
    fun sum(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
    println(sum(10, 20, 30))

    // vararg function
    fun sum(vararg numbers: Int): Int {
        var result = 0
        for (number in numbers) {
            result += number
        }
        return result
    }
    println(sum(10, 20, 30, 40, 50))
}