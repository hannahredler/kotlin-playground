package com.kotlinplayground.classes

class Item() {

    var name: String = ""
    var price: Double = 0.0
    get() {
        println("Inside getter")
        return field
    }
    set(value) {
        if (value > 0.0) {
            println("Inside setter!")
            field = value
        } else {
            throw IllegalArgumentException("Value not allowed!")
        }
    }


    constructor(_name: String): this() {
        name = _name
    }
}

fun main() {
    val item = Item("iphone")
    println("Item: ${item.name}")

    item.name = "iphone13"
    println("Item: ${item.name}")

    item.price = -10.4
    println("Item price: ${item.price}")

}