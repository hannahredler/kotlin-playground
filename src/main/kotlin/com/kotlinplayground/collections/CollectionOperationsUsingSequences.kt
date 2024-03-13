package com.kotlinplayground.collections

fun main() {

    val list = listOf("Hannah", "Jane", "Sol")
        .asSequence()
        .filter { it.length >= 4}
        .map { it.uppercase() }
        .toList()

    println("List: $list")
}