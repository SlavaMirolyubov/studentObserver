package com.mirolyubov.entity;

import java.time.LocalDate;
import java.util.List;

public class Student {

    private int studentId;
    private String studentName;
    private Curriculum studentCurriculum;
    private List<Integer> marks;
    private LocalDate startDate;

    public Student(int studentId, String studentName, Curriculum studentCurriculum, LocalDate startDate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCurriculum = studentCurriculum;
        this.startDate = startDate;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Curriculum getStudentCurriculum() {
        return studentCurriculum;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
