package com.myfirstkotlinproject.override_polymorphism

fun main() {
    val animal = Animal()
    val mammal = Mammal()
    val cat = Cat()
    val dog = Dog()

    animal.move() // Animal is moving
    mammal.move() // Animal is moving
    cat.move() // Cat is moving
    dog.move() // Dog is moving
}