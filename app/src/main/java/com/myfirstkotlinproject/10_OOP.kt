package com.myfirstkotlinproject

fun main() {
    val bmw = Car()
    println(bmw)

    bmw.start()
    println(bmw)

    bmw.increaseSpeed(50)
    println(bmw)
    bmw.decreaseSpeed(20)
    println(bmw)

    bmw.color = "blue"
    bmw.speed = 100
    bmw.isWorking = true
    println(bmw)

    val bmw2 = Car2("blue", 100, false)
    bmw2.start()
    bmw2.increaseSpeed(50)
    bmw2.decreaseSpeed(20)
    println(bmw2)
}

class Car {
    var color = "red"
    var speed = 0
    var isWorking = false

    fun start() {
        isWorking = true
        println("Car started")
    }

    fun increaseSpeed(speedValue: Int) {
        speed += speedValue
        println("Speed increased to $speed")
    }

    fun decreaseSpeed(speedValue: Int) {
        speed -= speedValue
        println("Speed decreased to $speed")
    }


    override fun toString(): String {
        return "Car(color='$color', speed=$speed, isWorking=$isWorking)"
    }
}

class Car2(private var color: String, private var speed: Int, private var isWorking: Boolean) {

    fun start() {
        isWorking = true
        println("Car2 started")
    }

    fun increaseSpeed(speedValue: Int) {
        speed += speedValue
        println("Speed increased to $speed")
    }

    fun decreaseSpeed(speedValue: Int) {
        speed -= speedValue
        println("Speed decreased to $speed")
    }


    override fun toString(): String {
        return "Car2(color='$color', speed=$speed, isWorking=$isWorking)"
    }
}
