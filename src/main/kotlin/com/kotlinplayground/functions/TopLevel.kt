package com.kotlinplayground.functions

fun topLevel() : Int {
    return (1..100).random()
}

const val courseName = "Constant"

fun main() {

    val num = topLevel()
    println("Num: $num")
}