package com.myfirstkotlinproject.override_polymorphism

class Cat : Mammal() {

    override fun move() {
        println("Cat is moving")
    }
}