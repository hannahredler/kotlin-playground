package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    val isCoursePersisted: Boolean

    fun getById(id: Int): Course

    fun save(course: Course) : Int {
        println("Saved course $course")
        return course.id
    }
}

interface Repository {

    fun getAll() : Any

}

class SQLCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Hannah", "CourseName")
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSQLCourseRepository : CourseRepository {
    override var isCoursePersisted: Boolean = false

    override fun getById(id: Int): Course {
        return Course(id, "Hannah", "CourseName")
    }

    override fun save(course: Course): Int {
        println("Saved course $course")
        return course.id
    }
}

interface A {

    fun doSomething() {
        println("A")
    }
}

interface B {

    fun doSomething() {
        println("B")
    }
}

class AB : A, B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("AB")
    }

}

fun main() {

    val sqlCourseRepository = SQLCourseRepository()
    val course = sqlCourseRepository.getById(22)
    println("SQL Course is $course")
    println("Course id: ${sqlCourseRepository.save(course)}")
    println("Is course persisted: ${sqlCourseRepository.isCoursePersisted}")

    val noSQLCourseRepository = NoSQLCourseRepository()
    val noSQLcourse = noSQLCourseRepository.getById(25)
    println("NOSQL Course is $noSQLcourse")

    println("Course id: ${println("Course id: ${sqlCourseRepository.save(course)}")}")

    val ab = AB()
    ab.doSomething()

}