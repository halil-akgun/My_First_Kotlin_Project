package com.myfirstkotlinproject

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // filter function
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers) // [2, 4, 6, 8, 10]

    // reduce function
    val sum = numbers.reduce { acc, i -> acc + i }
    println(sum) // 55

    // ArrayList
    val strings1 = ArrayList<String>()
    strings1.add("Hello")
    val strings2: ArrayList<String> = ArrayList()
    strings2.add("Hello")

    println(strings1[0]) // Hello
    println(strings2.get(0)) // Hello

    strings1.add("Hi")
    println(strings1) // [Hello, Hi]

    strings1[1] = "..."
    println(strings1) // [Hello, ...]

    // insert an element at a specific index
    strings1.add(1, "World")
    println(strings1) // [Hello, World, ...]

    for ((index, value) in strings1.withIndex()) {
        println("index: $index, value: $value")
    }


    val people = ArrayList<Person2>()
    people.add(Person2(1, "John", 30))
    people.add(Person2(2, "Alice", 25))
    people.add(Person2(3, "Bob", 35))
    people.add(Person2(4, "Jane", 20))
    people.add(Person2(5, "Tom", 40))

    // sortedWith function
    println("********** sorted by age: **********")
    val sortedPeople =
        people.sortedWith(compareBy(Person2::age, Person2::name)) // sorted by age then name
    sortedPeople.forEach { println("name: ${it.name}, age: ${it.age}") }

    // filter function
    println("********** filter by age > 25: **********")
    val filtered = people.filter { it.age > 25 }
    filtered.forEach { println("name: ${it.name}, age: ${it.age}") }

    // increase age of all people by 1
    println("********** increase age by 1: **********")
    people.forEach { it.age++ }
    people.forEach { println("name: ${it.name}, age: ${it.age}") }


    // Set
    println("********** HashSet **********")
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(3, 4, 5, 6, 7)
    val union = set1.union(set2)
    val intersection = set1.intersect(set2)
    val difference = set1.minus(set2)
    println("union: $union") // {1, 2, 3, 4, 5, 6, 7}
    println("intersection: $intersection") // {3, 4, 5}
    println("difference: $difference") // {1, 2}

    val peopleSet = HashSet<Person2>()
    peopleSet.add(Person2(1, "John", 30))
    peopleSet.add(Person2(2, "Alice", 25))
    peopleSet.add(Person2(3, "Bob", 35))
    peopleSet.add(Person2(4, "Jane", 20))
    peopleSet.add(Person2(4, "Tom", 40)) // Tom will be ignored because it has the same id as Jane

    println(peopleSet.size) // 4
}

class Person2(var id: Int, var name: String, var age: Int) {
    override fun hashCode(): Int {
        return this.id
    }

    override fun equals(other: Any?): Boolean {
        if (other is Person2) {
            return this.id == other.id
        }
        return false
    }
}