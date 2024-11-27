package com.myfirstkotlinproject.polymorphism_upcasting_downcasting

class Manager : Employee() {

    fun hire(e: Employee) {
        e.work()
    }

    fun promote(e: Employee) {

        if (e is Teacher) {
            (e as Teacher).increaseSalary() // downcasting
        } else {
            println("Only teachers can be promoted")
        }
    }
}