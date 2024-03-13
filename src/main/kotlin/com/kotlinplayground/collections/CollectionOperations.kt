package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {

    val courseList = courseList()

//    val designPredicate = { it: Course -> it.category === CourseCategory.DESIGN }
//    exploreFilter(courseList) { it.category === CourseCategory.DEVELOPMENT }
//    exploreFilter(courseList) { it.category === CourseCategory.DESIGN }

//    val listOfLists = listOf(listOf(1,2,3), listOf(4,5,6))
//
//    val otherList = listOfLists.map {
//        outerList -> outerList.map {
//        it.toDouble()
//        }
//    }
//
//    println("otherList: $otherList")

//    val flatList = listOfLists.flatMap {
//        outerList -> outerList.map {
//            it.toDouble()
//        }
//    }
//    println("flatList: $flatList")
//    exploreMap(courseList, designPredicate)

//    val myCourses = exploreFlatMap(courseList, "Kafka")
//    println("Courses: $myCourses")
    exploreHashmap(courseList)
}

fun exploreHashmap(courseList: MutableList<Course>) {
    val myMap =mutableMapOf("Hannah" to 32, "Sol" to 29)
    myMap.forEach{ (k,v) ->
        println("Key: $k, Value: $v")
    }
    val value = myMap.getOrDefault("Hannah", 0)
    val value2 = myMap.getOrDefault("Hann", 0)

    println("Result1: $value")
    println("Result2: $value2")

    val newMap = myMap.filterKeys { it.length > 4 }

    println("MAP: $newMap")

    val max = myMap.maxByOrNull { it.value }
    println("Max: $max")
}

fun exploreFlatMap(courseList: MutableList<Course>, topic: String) : List<String> {

    val topicCourses = courseList.flatMap { course ->
        val courseName = course.name
        println("Course $course")
        course.topicsCovered
            .filter { it == topic}
            .map{ courseName }
    }
    return topicCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    val courses = courseList
        .filter(predicate)
        .map { "Name: ${it.name}, Category: ${it.category}" }
    println("Course names: $courses")
}

fun exploreFilter(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    courseList
        .filter { predicate.invoke(it) }
        .forEach {
            println("Course: $it")
        }
}

