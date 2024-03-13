package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevel

fun main() {

    val valName: String = "Hannah" // cannot modify
    println(valName)

    var name: String = "Hannah"
    println(name)
    name = "Sol"
    println(name)

    val salary = 30000L
    println(salary)

    val course = "Kotlin String"
    println("course: $course and the course length is ${course.length}")

    var multiline = "ABC \n DEF"
    println(multiline)

    var multilinetriple = """
        ABC
        DEF
    """.trimIndent()

    println(multilinetriple)

    topLevel()
    println(courseName)
}