package com.myfirstkotlinproject.inheritance

fun main() {
    val car = Car("red", "auto", "sport")
    println(car.color)
    println(car.gearType)
    println(car.bodyType)

    val nissan = Nissan("white", "auto", "sedan", "micra")
    println(nissan.color)
    println(nissan.gearType)
    println(nissan.bodyType)
    println(nissan.model)
}