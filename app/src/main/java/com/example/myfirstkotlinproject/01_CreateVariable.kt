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
    var productName: String = "Laptop"
    var productPrice: Double = 1000.0
    var productQuantity: Int = 10
    var productDescription: String = "A high-performance laptop for work and play."

    // using variable in string
    println("The price of $productName is $productPrice")
}