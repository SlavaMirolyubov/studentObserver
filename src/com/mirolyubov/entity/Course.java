package com.mirolyubov.entity;

public class Course {

    private int courseId;
    private String courseName;
    private int courseDuration;

    public Course(int courseId, String courseName, int courseDuration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }
}
