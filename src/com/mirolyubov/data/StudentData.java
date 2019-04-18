package com.mirolyubov.data;

import com.mirolyubov.entity.Student;
import com.mirolyubov.services.CurriculumService;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.time.temporal.ChronoUnit.DAYS;

public class StudentData {

    private CurriculumData curriculumData = new CurriculumData();

    private List<Student> students = new ArrayList<>();

    private CurriculumService curriculumService = new CurriculumService();

    public StudentData() {
        fillStudentList();
        fillMarksList();
    }

    public List<Student> getStudents() {
        return students;
    }

    private void fillStudentList() {
        students.add(new Student(1, "Ivan Ivanov",
                curriculumData.getCurriculumById(1), LocalDate.of(2019, 4, 17)));

        students.add(new Student(2, "Petr Petrov",
                curriculumData.getCurriculumById(1), LocalDate.of(2019, 4, 16)));

        students.add(new Student(3, "Dmitry Dmitriev",
                curriculumData.getCurriculumById(2), LocalDate.of(2019, 3, 28)));

        students.add(new Student(4, "Alex Alexeev",
                curriculumData.getCurriculumById(2), LocalDate.of(2019, 4, 1)));

        students.add(new Student(5, "Sergey Sergeev",
                curriculumData.getCurriculumById(3), LocalDate.of(2019, 3, 15)));

        students.add(new Student(6, "Andrew Andreev",
                curriculumData.getCurriculumById(3), LocalDate.of(2019,4, 14)));
    }

    private void fillMarksList() {

        students.forEach(x -> x.setMarks(getRandomMarksListForStudent(x)));

    }

    private List<Integer> getRandomMarksListForStudent(Student student) {

        List<Integer> marks = new ArrayList<>();

        int numberofmarks = curriculumService.getCurriculumDuration(student.getStudentCurriculum());

        for (int i = 0; i < numberofmarks; i++) {

            marks.add(ThreadLocalRandom.current().nextInt(3, 6));

        }

        return marks;

    }

}
