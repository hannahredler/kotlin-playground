package com.kotlinplayground.classes

class Person(val name: String = "noname", val age: Int = 25) {

    var email:String = ""
    var nameLength = 0

    init {
        println("Initializing")
        nameLength = name.length
    }
    constructor(_email: String, _name: String = "noname", _age: Int = 25) : this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person walks")
    }
}


fun main() {
    val person = Person("Hannah", 32)
    person.action()
    println("Name: ${person.name}, Age: ${person.age}")

    val defaultPerson = Person()
    println("Name: ${defaultPerson.name}, Age: ${defaultPerson.age}")

    val secondPerson = Person("hannah@codes.com", "Hannah", 15)
    println("Name: ${secondPerson.name}, Age: ${secondPerson.age} Email: ${secondPerson.email} Name Length: ${secondPerson.nameLength}")
}