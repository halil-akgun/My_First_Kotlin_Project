package com.myfirstkotlinproject.accessmodifiers.package1

class A {
    val publicVariable = "public variable in A"
    internal val internalVariable = "internal variable in A"
    protected val protectedVariable = "protected variable in A"
    private val privateVariable = "private variable in A"

//    companion object MyCompanionObject { // also we can name it anything
    companion object {
        var staticVariable = "static variable in A"

        fun staticFunction() {
            println("static function in A")
        }
    }
}