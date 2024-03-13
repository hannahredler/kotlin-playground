package com.kotlinplayground.classes

open class User(val name: String) {

    open var isLoggedIn: Boolean =  false

    open fun login() {
        println("Inside user login")
    }

    private fun secret() {
        println("Secrets")
    }

    protected open fun logout() {
        secret()
        println("logout")
    }

}

class Student(name: String) : User (name) {

    override var isLoggedIn: Boolean = true
    override fun login() {
        println("Inside student login")
    }

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "USA"
    }

    public override fun logout() {
        println("Inside student logout")
        super.logout()
    }
}
class Instructor(name: String) : User (name)

fun main() {

    println("Country: ${ Student.country() }")
    println("Enrolled course: ${ Student.noOfEnrolledCourses }")

    val student = Student("Hannah")
    println("Student ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Is student logged in? ${student.isLoggedIn}")

    val instructor = Instructor("Sol")
    println("Instructor ${instructor.name}")
    instructor.login()

    val user = User("hello")

    student.logout()

}