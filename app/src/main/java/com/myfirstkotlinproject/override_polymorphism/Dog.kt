package com.myfirstkotlinproject.override_polymorphism

class Dog : Mammal() {

    override fun move() {
        println("Dog is moving")
    }
}