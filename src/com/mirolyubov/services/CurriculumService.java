package com.mirolyubov.services;

import com.mirolyubov.entity.Course;
import com.mirolyubov.entity.Curriculum;

public class CurriculumService {

    public int getCurriculumDuration(Curriculum curriculum) {

        return curriculum.getCourseList().stream().mapToInt(Course::getCourseDuration).sum();

    }

}
