package com.example.myfirstkotlinproject

fun main() {
    var scopeOfVariable = ScopeOfVariable()
    scopeOfVariable.topla() // output: 50
}

class ScopeOfVariable {
    var x = 10
    var y = 20

    fun topla() {
        var x = 30
        var z = x + y
        println(z)
    }
}