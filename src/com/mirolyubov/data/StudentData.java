package com.mirolyubov.data;

import com.mirolyubov.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {

    CurriculumData curriculumData = new CurriculumData();

    List<Student> students = new ArrayList<>();

    public StudentData() {

    }

    private List<Student> fillStudentList() {
        students.add(new Student(1, "Ivan Ivanov", ));
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
    }


}
