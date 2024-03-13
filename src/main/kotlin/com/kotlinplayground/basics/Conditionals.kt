package com.kotlinplayground.basics

fun main() {
    val name = "Alexis"

    val res = if (name.length === 4) {
        println("name is 4 characters")
        name
    } else {
        println("Not")
        name
    }

    println("res: $res")

    val position = 2

    val medal = if (position === 1) {
        "GOLD"
    } else if (position === 2) {
        "SILVER"
    } else if (position === 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    println (medal)

    val whenMedal = when(position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(whenMedal)
}