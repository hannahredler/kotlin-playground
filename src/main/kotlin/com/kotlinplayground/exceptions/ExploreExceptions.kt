package com.kotlinplayground.exceptions

fun main() {


    println("name length is ${nameLength("Hello")}")
    println("name length is ${nameLength(null)}")

//    returnNothing()
}

fun nameLength(name: String?): Int? {
    return try {
        name!!.length
    } catch(ex: Exception) {
        println("Exception is: $ex")
        null
    }
}

fun returnNothing() : Nothing {
    throw RuntimeException()
}


