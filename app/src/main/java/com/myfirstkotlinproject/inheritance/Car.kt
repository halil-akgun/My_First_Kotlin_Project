package com.myfirstkotlinproject.inheritance

open class Car(color: String, gearType: String, var bodyType: String) : Vehicle(color, gearType) {
}