package com.myfirstkotlinproject

fun main() {
    val thread1 = Thread1()
    val thread2 = Thread(Thread2())
    thread1.start()
    thread2.start()

    for (i in 300..333) {
        println("##### Main Thread: $i")
        Thread.sleep(100)
    }
}

// extends Thread
class Thread1 : Thread() {
    override fun run() {
        for (i in 100..133) {
            println("----- Thread 1: $i")
            sleep(100)
        }
    }
}

// implements Runnable
class Thread2 : Runnable {
    override fun run() {
        for (i in 200..233) {
            println("///// Thread 2: $i")
            Thread.sleep(155)
        }
    }
}