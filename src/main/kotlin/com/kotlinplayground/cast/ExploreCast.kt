package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course

fun main() {

    val course = Course(1, "Hannah", "Thing")
    
    checkType(course)
    checkType("Hannah")

    castNumber(1.1)
    castNumber(1)
}

fun castNumber(something: Any) {

    when(something) {
        something as? Double -> println("Its a double")
        something as? Integer -> println("Its a integer")

    }

}

fun checkType(thing: Any) {

    when (thing) {
        is Course -> {
            println(thing)
        }
        is String -> {
            println(thing.lowercase())
        }

    }
}
