package com.kotlinplayground.assignments.assignment1

data class Employee (val id: Int, val name: String)

fun main() {

    val employee1 = Employee(1, "Hannah")
    val employee2 = Employee(1, "Hannah")

    print ("Employee 1: $employee1")
    println("Is Employee 1 the same as Employee 2: ${employee1 == employee2}")

    val employee3 = employee1.copy(id = 3)
    println("Employee 3: $employee3")


}