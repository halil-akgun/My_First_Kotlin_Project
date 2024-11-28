package com.myfirstkotlinproject.interface_

fun main() {
    val lion = Lion()
    val amasyaApple: Apple = AmasyaApple()
    val apple = Apple()
    val chicken: Eatable = Chicken()

    val objectsList = listOf(lion, amasyaApple, apple, chicken)
//    objectsList.forEach { item -> // A custom name like "item" can be assigned here
    objectsList.forEach { // If no custom name is provided, "it" is used as the default identifier
        if (it is Eatable) {
            it.howToEat()
        }

        if (it is Squeezable) {
            it.howToSqueeze()
        }
    }

    val objectsArray = arrayOf(lion, amasyaApple, apple, chicken)
    for (o in objectsArray) {
        if (o is Eatable) {
            o.howToEat()
        }

        if (o is Squeezable) {
            o.howToSqueeze()
        }
    }
}