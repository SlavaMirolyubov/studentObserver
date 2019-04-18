package com.mirolyubov.services;

import com.mirolyubov.data.StudentData;
import com.mirolyubov.entity.Curriculum;
import com.mirolyubov.entity.Student;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

public class StudentService {

    private StudentData studentData = new StudentData();

    private CurriculumService curriculumService = new CurriculumService();

    public List<Student> getAllStudents() {

        return studentData.getStudents();

    }


    int lostDaysofCurriculum(Student student) {

        int curriculumDuration = curriculumService.getCurriculumDuration(student.getStudentCurriculum());

        LocalDate studentCurriculumStartDate = student.getStartDate();

        if (daysToEndOfCurriculum(curriculumDuration, studentCurriculumStartDate) == 0) {
            return 0;
        } else {
            return daysToEndOfCurriculum(curriculumDuration, studentCurriculumStartDate);
        }

    }

    private int daysToEndOfCurriculum(int curriculumDuration, LocalDate studentCurriculumStartDate) {

        int days = (int) DAYS.between(studentCurriculumStartDate, LocalDate.now());
        int lostDays = curriculumDuration - days;

        if (lostDays <= 0) {
            return 0;
        } else {
            return lostDays;
        }

    }

    double getAverageMark(Student student) {

        return student.getMarks().stream().mapToDouble(Integer::intValue).average().getAsDouble();

    }

    String canBeDeduct(Student student) {

        if ((getAverageMark(student) < 4.5) && lostDaysofCurriculum(student) == 0) {
            return "Студент не принят в компанию";
        }
        else if ((getAverageMark(student) >= 4.5) && lostDaysofCurriculum(student) == 0){
            return "Успешно принят в компанию";
        } else {
            return "Студент еще учится " + possibleDeduct(student);
        }

    }

    List<Student> sortedByMark() {

            return studentData.getStudents().stream()
                    .sorted(Comparator.comparingDouble(this::getAverageMark).reversed())
                    .collect(Collectors.toList());

    }

    List<Student> sortedByRemainingDays() {
        return studentData.getStudents().stream()
                .sorted(Comparator.comparingDouble(this::lostDaysofCurriculum).reversed())
                .collect(Collectors.toList());
    }

    private String possibleDeduct(Student student) {

        double possibleAvgMark = (getAverageMark(student) + 5.0) / 2;

        if (possibleAvgMark > 4.5) {
            return " и если постарается, то доучится успешно";
        }
        else if (possibleAvgMark > 4.4){
            return " и есть шансы доучиться успешно";
        } else {
            return " и скорее всего его отчислят";
        }

    }


}
