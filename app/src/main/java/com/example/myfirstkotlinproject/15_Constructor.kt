package com.example.myfirstkotlinproject

fun main() {
    val person = Person("John", 30)
    println(person)
}

class Person(val name: String, private val age: Int) {
    init {
        // when the object is created this code will be executed
        println("Constructor called")
    }

    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}
