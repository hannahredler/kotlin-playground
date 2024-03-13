package com.kotlinplayground.nulls

data class Movie (val id: Int?, val name: String)

fun printName(name: String) {
    println("Name is $name")
}

fun main() {

    var nullableName: String? = null
    println(nullableName)
    println(nullableName?.length ?: 0)

    nullableName?.run {
        printName(this)
    }

    nullableName = "Hannah"
    println(nullableName)
    println(nullableName?.length ?: 0)

    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println("Saved movie: ${savedMovie.id}")
    println("Asserting not null ${savedMovie.id!!}")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
}