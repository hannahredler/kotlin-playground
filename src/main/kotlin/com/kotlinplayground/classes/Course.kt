@file:JvmName("CourseKotlin")

package com.kotlinplayground.classes

import com.kotlinplayground.CourseJava

data class Course @JvmOverloads

    constructor(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPMENT) {

    @JvmField
    var noOfCourses = 10

    companion object {

        @JvmStatic
        fun printNameInCourse(name: String = "default") {
            println("name: $name")
        }
    }
}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

@JvmName("printFromKotlin")
@JvmOverloads
fun printName(name: String = "default") {
    println("name: $name")
}

fun main() {
    val course1 = Course(1, "Kotlin", "Hannah")
    val course2 = Course(2, "Kotlin", "Hannah", CourseCategory.MARKETING)

    println(course1)
    println("Courses are the same? ${course1 == course2}")


    val course3 = course2.copy(id = 3)

    println("Course 3: $course3")

    val javaCourse = CourseJava(
        2,
        "course name",
        "an author"
    )

    println("course jave: $javaCourse")

    javaCourse.id = 3
    javaCourse.name = "another name"

    println("course jave: $javaCourse")
}
