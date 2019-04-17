package com.mirolyubov.services;

import com.mirolyubov.entity.Student;

public class Demo {

    private StudentService studentService = new StudentService();

    public void showStudentsInfoSortedByAverageMark() {

        for (Student student : studentService.getAllStudents()) {

            System.out.println(student.getStudentName());
            System.out.println(studentService.lostDaysofCurriculum(student));

        }

    }

    public void showStudentsInfoSortedByTimeUntilEndCurriculum() {



    }
}
