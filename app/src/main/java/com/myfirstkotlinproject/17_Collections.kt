package com.myfirstkotlinproject

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // map function
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // [2, 4, 6, 8, 10]

    // reduce function
    val sum = numbers.reduce { acc, i -> acc + i }
    println(sum) // 55

    // ArrayList
    val strings1 = ArrayList<String>()
    strings1.add("Hello")
    val strings2: ArrayList<String> = ArrayList()
    strings2.add("Hello")

    println(strings1[0]) // Hello
    println(strings2.get(0)) // Hello

    strings1.add("Hi")
    println(strings1) // [Hello, Hi]

    strings1[1] = "..."
    println(strings1) // [Hello, ...]

    // insert an element at a specific index
    strings1.add(1, "World")
    println(strings1) // [Hello, World, ...]

    for ((index, value) in strings1.withIndex()) {
        println("index: $index, value: $value")
    }
}