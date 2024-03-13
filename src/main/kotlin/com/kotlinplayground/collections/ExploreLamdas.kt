package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList


fun calculate(x:Int, y:Int, op: (x: Int, y:Int) -> Int) : Int {
    return op(x,y)
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach {
            println("Course: $it")
        }

}

fun main() {

//    val addLambda = { x: Int -> x +x}
//
//    println("add result: ${addLambda(3)}")
//
//    val multiplyLambda = { x: Int, y:Int ->
//        println("y is $y and x is $x")
//        x * y
//    }
//    println("multiply result: ${multiplyLambda(2,3)}")
//
//    println("Multiply again: ${calculate(1, 2, multiplyLambda)}")
//    println("Minus: ${calculate(1, 2) { a, b -> a - b }}")
//
//    val predicate = { it: Course -> it.category === CourseCategory.DEVELOPMENT }
//    exploreFilterUsingSequence(courseList(), predicate)
//
//    val range = 1..1_000_000_000
//    range.asSequence().map{ it.toDouble()}.forEach{ println("Value: $it")}

    collectionsNullability()
}

fun collectionsNullability() {
    var list: List<String>? = null

    list = mutableListOf()
    list.add("thing")

    var otherList: List<String?> = listOf("One", null, "Two")

    otherList.forEach{ println("Length is: ${it?.length}")}
}
