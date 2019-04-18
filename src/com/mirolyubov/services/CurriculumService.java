package com.mirolyubov.services;

import com.mirolyubov.entity.Course;
import com.mirolyubov.entity.Curriculum;
import com.mirolyubov.entity.Student;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class CurriculumService {

    public int getCurriculumDuration(Curriculum curriculum) {

        return (int) (curriculum.getCourseList().stream().mapToInt(Course::getCourseDuration).sum() / 8.0);

    }

}
