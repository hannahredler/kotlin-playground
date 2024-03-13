package com.kotlinplayground.scopefunctions

import com.kotlinplayground.classes.Course

fun main() {

    val str = "Hello"

    str.run { println("Length: $length") }
    str.let { println("Length: ${it.length}")}
    
    exploreApply()
    exploreLet()
}

fun exploreLet() {
    val numbers = listOf(1,2,3,4,5)

    val sum = numbers.map { it * 2 }.filter{ it >  5}.let {
        println(it)
        it.sum()
    }


    var name: String? = "thing"

    name?.let { println(it.length) }
    println("Sum: $sum")
}

fun exploreApply() {
    val course: Course = Course(1, "Hannah", "naem")

    course.apply {
        courseCategory = com.kotlinplayground.classes.CourseCategory.MARKETING
    }

    println("Course: $course")
}

fun exploreAlso() {
    val course: Course = Course(1, "Hannah", "naem")

    course.also {
        println("Heres something")
    }
}
