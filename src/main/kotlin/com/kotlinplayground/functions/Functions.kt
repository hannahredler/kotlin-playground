package com.kotlinplayground.functions

import java.time.LocalDate

fun main () {
//    val nameprinted = printName("hello")
//    println(nameprinted)
//    val result = addition(1, 2)
//    println("Result is: $result")
//    val anotherResult = additionInline(1, 2)
//    println("Result is: $anotherResult")

//    printPersonDetails("Hannah", "email")
//    printPersonDetails("Hannah", "email", LocalDate.parse("1991-08-23"))
//    printPersonDetails(dob = LocalDate.parse("1991-08-23"),name = "Hannah", email = "email")

    topLevel()

}

fun printPersonDetails(name: String, email: String, dob: LocalDate = LocalDate.now()) {
    println("Name is $name and email is $email and dob is $dob")
}

fun additionInline(x: Int, y: Int) = x + y

fun addition(x: Int, y: Int): Int {
    return x + y
}


fun printName(name: String) : Unit {
    println("Name is $name")
}
