package com.mirolyubov.services;

import com.mirolyubov.data.StudentData;
import com.mirolyubov.entity.Curriculum;
import com.mirolyubov.entity.Student;

import java.util.List;

public class StudentService {

    private StudentData studentData = new StudentData();

    private CurriculumService curriculumService = new CurriculumService();

    public List<Student> getAllStudents() {

        return studentData.getStudents();

    }

    private void countAverageMarkForStudent(Student student) {



    }

    public int lostDaysofCurriculum(Student student) {

        int curriculumDuration = curriculumService.getCurriculumDuration(student.getStudentCurriculum());



    }

}
