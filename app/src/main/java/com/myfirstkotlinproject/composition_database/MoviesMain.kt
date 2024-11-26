package com.myfirstkotlinproject.composition_database

fun main() {

    val category1 = Category(1, "Action")
    val category2 = Category(2, "Comedy")
    val director1 = Director(1, "John Doe")
    val director2 = Director(2, "Jane Doe")
    val movie1 = Movie(1, "The Avengers", 2012, category1, director1)
    val movie2 = Movie(2, "The Matrix", 1999, category2, director2)

    println(movie1.id)
    println(movie1.name)
    println(movie1.year)
    println(movie1.category.name)
    println(movie1.director.name)
}