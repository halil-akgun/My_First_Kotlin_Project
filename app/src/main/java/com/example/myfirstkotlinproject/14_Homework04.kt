package com.example.myfirstkotlinproject

fun main() {

    fun countLetters(str: String, letter: Char): Int {
        var count = 0
        for (char in str) {
            if (char == letter) {
                count++
            }
        }
        return count
    }

    val str = "Hello, Kotlin!"
    val letter = 'o'
    val count = countLetters(str, letter)
    println("The letter '$letter' appears $count times in the string '$str'")
}