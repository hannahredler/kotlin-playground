package com.kotlinplayground.basics

fun main() {
//    val range = 1..10
//    for (i in range) {
//        println("i: $i")
//    }
//
//    val oppRange = 10 downTo 1
//    for (i in oppRange) {
//        println("i: $i")
//    }
//
//    for (i in oppRange step 2) {
//        println("i: $i")
//    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("i: $i")
        i++
    } while (i< 5)
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("x: $x")
        x++
    }
}
