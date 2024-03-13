package com.kotlinplayground;

import com.kotlinplayground.classes.Authenticate;
import com.kotlinplayground.classes.Course;
import com.kotlinplayground.classes.CourseCategory;
import com.kotlinplayground.classes.CourseKotlin;


public class InvokeKotlinFromJava {

    public static void main(String[] args) {

        var course = new Course(
                1,
                "Course name",
                "Author",
                CourseCategory.BUSINESS
        );

        var course2 = new Course(
                1,
                "Course name",
                "Author"
        );

        CourseKotlin.printFromKotlin();
        CourseKotlin.printFromKotlin("abc");

        Course.Companion.printNameInCourse("def");
        Course.printNameInCourse("ghi");

        course.noOfCourses = 11;

        System.out.println("no: " + course.noOfCourses);

        Authenticate.INSTANCE.authenticate("username", "password");
        Authenticate.authenticate("username", "password");
    }
}
