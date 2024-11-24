package com.myfirstkotlinproject.accessmodifiers.package2

import com.myfirstkotlinproject.accessmodifiers.package1.A
import com.myfirstkotlinproject.accessmodifiers.package1.ParentClass

class B : ParentClass() { // this is a child class of ParentClass

    fun functionA() {
        val a = A()

        println(a.publicVariable)
//        println(a.protectedVariable) // not accessible
        println(a.internalVariable)
//        println(a.privateVariable) // not accessible
    }

    fun functionParentClass() {
        println(publicVariable)
        println(protectedVariable)
        println(internalVariable)
//        println(privateVariable) // not accessible
    }
}

fun main() {
    B().functionA()
    B().functionParentClass()

    println(A.staticVariable)
    A.staticFunction()
}