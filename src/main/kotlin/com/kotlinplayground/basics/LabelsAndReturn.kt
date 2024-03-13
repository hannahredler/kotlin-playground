package com.kotlinplayground.basics

fun main() {

    for (i in 1..5) {
        println("i is $i")
        if (i == 3) break
    }

    for (i in 1..5) {
        println("i is $i")
        if (i == 3) return
    }

    label()
    println("End of the program")
}

fun label() {
    loop@ for (i in 1..5) {
        println("i in label $i")
//        if (i == 3) break@loop

        innerloop@ for (j in 1..5) {
            println("j in label $j")
            if (j==2) break@innerloop
        }
    }
}
