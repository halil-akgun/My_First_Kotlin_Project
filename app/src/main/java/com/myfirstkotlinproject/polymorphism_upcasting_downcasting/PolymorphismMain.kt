package com.myfirstkotlinproject.polymorphism_upcasting_downcasting

fun main() {
    val teacher: Employee = Teacher() // upcasting
    val officer: Employee = Officer() // upcasting
    val manager = Manager()

    manager.hire(teacher)
    manager.hire(officer)

    manager.promote(teacher)
    manager.promote(officer)
}