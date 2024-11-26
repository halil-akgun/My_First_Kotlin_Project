package com.myfirstkotlinproject.composition_database

class Movie(
    var id: Int,
    var name: String,
    var year: Int,
    var category: Category,
    var director: Director
) {
}