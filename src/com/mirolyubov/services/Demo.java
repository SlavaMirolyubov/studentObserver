package com.mirolyubov.services;

import com.mirolyubov.entity.Student;

public class Demo {

    private StudentService studentService = new StudentService();

    public void showStudentsInfoSortedByAverageMark() {

        for (Student student : studentService.sortedByMark()) {

            System.out.println(student.getStudentName());
            System.out.println("Дней до завершения курса : " + studentService.lostDaysofCurriculum(student));
            System.out.println("Средняя оценка студента : " + studentService.getAverageMark(student));
            System.out.println(studentService.canBeDeduct(student));

        }

    }

    public void showStudentsInfoSortedByTimeUntilEndCurriculum() {

        for (Student student : studentService.sortedByRemainingDays()) {

            System.out.println(student.getStudentName());
            System.out.println("Дней до завершения курса : " + studentService.lostDaysofCurriculum(student));
            System.out.println("Средняя оценка студента : " + studentService.getAverageMark(student));
            System.out.println(studentService.canBeDeduct(student));

        }



    }
}
