package com.mirolyubov.entity;

import java.util.List;

public class Curriculum {

    private int curriculumId;
    private String curriculumName;
    private List<Course> courseList;

    public Curriculum(int curriculumId, String curriculumName, List<Course> courseList) {
        this.curriculumId = curriculumId;
        this.curriculumName = curriculumName;
        this.courseList = courseList;
    }

    public int getCurriculumId() {
        return curriculumId;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
