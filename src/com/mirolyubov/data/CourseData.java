package com.mirolyubov.data;

import com.mirolyubov.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseData {

    private List<Course> coursesForJ2EE = new ArrayList<>();
    private List<Course> coursesForFrontend = new ArrayList<>();
    private List<Course> coursesForPythonDeveloper = new ArrayList<>();

    public CourseData() {
        fillLists();
    }

    public List<Course> getCoursesForJ2EE() {
        return coursesForJ2EE;
    }

    public List<Course> getCoursesForFrontend() {
        return coursesForFrontend;
    }

    public List<Course> getCoursesForPythonDeveloper() {
        return coursesForPythonDeveloper;
    }

    private void fillLists() {

        coursesForJ2EE.add(new Course(1, "Spring MVC", 24));
        coursesForJ2EE.add(new Course(2, "Spring Boot", 16));
        coursesForJ2EE.add(new Course(3, "Hibernate", 10));
        coursesForJ2EE.add(new Course(4, "Spring Cloud", 8));
        coursesForJ2EE.add(new Course(5, "Servlets", 18));

        coursesForFrontend.add(new Course(6, "Основы HTML", 8));
        coursesForFrontend.add(new Course(7, "Основы CSS", 8));
        coursesForFrontend.add(new Course(8, "Основы JavaScript", 16));
        coursesForFrontend.add(new Course(9, "Node.js environment", 20));
        coursesForFrontend.add(new Course(10, "YII Framework", 24));

        coursesForPythonDeveloper.add(new Course(11, "Основы Pyhon", 18));
        coursesForPythonDeveloper.add(new Course(12, "Django", 12));
        coursesForPythonDeveloper.add(new Course(13, "pypyodbc script", 16));
        coursesForPythonDeveloper.add(new Course(14, "PyCharm", 8));
        coursesForPythonDeveloper.add(new Course(15, "PostgreSQL", 24));
    }
}
