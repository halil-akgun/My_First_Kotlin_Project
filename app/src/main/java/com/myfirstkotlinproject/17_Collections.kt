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


    val people = ArrayList<Person2>()
    people.add(Person2("John", 30))
    people.add(Person2("Alice", 25))
    people.add(Person2("Bob", 35))
    people.add(Person2("Jane", 20))
    people.add(Person2("Tom", 40))

    // sortedWith function
    println("********** sorted by age: ********** ")
    val sortedPeople =
        people.sortedWith(compareBy(Person2::age, Person2::name)) // sorted by age then name
    sortedPeople.forEach { println("name: ${it.name}, age: ${it.age}") }

    // filter function
    println("********** filter by age > 25: ********** ")
    val filtered = people.filter { it.age > 25 }
    filtered.forEach { println("name: ${it.name}, age: ${it.age}") }

    // increase age of all people by 1
    println("********** increase age by 1: ********** ")
    people.forEach { it.age++ }
    people.forEach { println("name: ${it.name}, age: ${it.age}") }
}

class Person2(var name: String, var age: Int)