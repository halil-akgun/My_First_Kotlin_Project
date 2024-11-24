package com.myfirstkotlinproject

fun main() {
    val str: String? = null // nullable type
//    println(str.trim()) // Compile Error
    println(str?.trim()) // null ( if u use ? it will not throw an exception even if the value is null)
//    println(str!!.trim()) // NullPointerException (if u use !! it will throw an exception even if the value is null)


    lateinit var name: String // late initialization
    name = "John"
    println(name)

//    lateinit var age: int // we can't use lateinit for primitive types
}
