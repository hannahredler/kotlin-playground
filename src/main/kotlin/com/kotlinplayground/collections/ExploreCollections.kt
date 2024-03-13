package com.kotlinplayground.collections

fun main() {

    val names = listOf("Hello", "there")
    println("names: $names")

    val mutableNames = mutableListOf("Thing", "again")
    mutableNames.add("another")
    println("names: $mutableNames")

    val namesSet = setOf("Hello", "there")
    println("namesSet: $namesSet")

    val mutableSet = mutableSetOf("Hello", "there")
    println("names: $mutableSet")

    val nameAgeMap = mapOf("Hannah" to 32)
    val nameAgeMutableMap = mutableMapOf("Hannah" to 32)
    println(nameAgeMap)
    println(nameAgeMutableMap)
}