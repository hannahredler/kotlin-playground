package com.kotlinplayground.classes

object Authenticate {

    @JvmStatic
    fun authenticate(username: String, password: String) {
        println("User authenticated: $username, $password")
    }
}

fun main() {
    Authenticate.authenticate("Hannah", "password")
}