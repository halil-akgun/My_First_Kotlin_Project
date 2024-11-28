package com.myfirstkotlinproject.interface_

open class Apple : Eatable, Squeezable {
    override fun howToEat() {
        println("Apple how to eat")
    }

    override fun howToSqueeze() {
        println("Apple how to squeeze")
    }
}