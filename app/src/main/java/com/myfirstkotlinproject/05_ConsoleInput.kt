package com.myfirstkotlinproject

import java.util.Scanner

fun main() {
    println("Enter your name: ")
    val input = Scanner(System.`in`)
//    val name = input.next() // takes only one word
    val name = input.nextLine() // takes multiple words
    println("Your name is $name")

    println("Enter your age: ")
    val age = input.nextInt() // if input is not a number then it will throw an exception
    println("Your age is $age")

    // if-else

    if (age >= 18) {
        println("You are eligible to vote")
    } else {
        println("You are not eligible to vote")
    }

    if (age >= 18) println("You are eligible to vote") else println("You are not eligible to vote")

    if (age >= 18) println("You are eligible to vote")
    else println("You are not eligible to vote")
}