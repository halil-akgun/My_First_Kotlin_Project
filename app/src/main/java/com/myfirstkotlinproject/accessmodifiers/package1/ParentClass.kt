package com.myfirstkotlinproject.accessmodifiers.package1

open class ParentClass { // we use "open" keyword to make this class inheritable
    val publicVariable = "public variable in ParentClass"
    internal val internalVariable = "internal variable in ParentClass"
    protected val protectedVariable = "protected variable in ParentClass"
    private val privateVariable = "private variable in ParentClass"
}