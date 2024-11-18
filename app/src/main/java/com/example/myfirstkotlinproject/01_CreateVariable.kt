package com.example.myfirstkotlinproject

fun main() {
    // variable declaration
    var studentName = "John"
    var studentAge = 20
    var studentHeight = 1.77
    var letterGrade = 'A'

    println(studentName)
    println(studentAge)
    println(studentHeight)
    println(letterGrade)


    // variable declaration with type
    val productName: String = "Laptop"
    val productPrice: Double = 1000.0
    val productQuantity: Int = 10

    // using variable in string
    println("The price of $productName is $productPrice")
    // using more than one variable in string
    println("Total price is ${productPrice * productQuantity}")

    // type safety: Kotlin doesn't allow type mismatch
//    productName = 3
}