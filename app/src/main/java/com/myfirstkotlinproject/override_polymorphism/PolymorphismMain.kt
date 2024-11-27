package com.myfirstkotlinproject.override_polymorphism

fun main() {
    // Creating an instance of Dog, but referring to it as an Animal type
    val animal: Animal = Dog()

    // This will call the overridden move() function in the Dog class
    // Polymorphism ensures the correct method is chosen at runtime
    animal.move()
}