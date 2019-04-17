package com.mirolyubov.data;

import com.mirolyubov.entity.Curriculum;

import java.util.ArrayList;
import java.util.List;

public class CurriculumData {

    private CourseData courseData = new CourseData();

    private List<Curriculum> curriculumList = new ArrayList<>();

    CurriculumData () {
        fillCurriculumList();
    }

    private void fillCurriculumList() {

        curriculumList.add(new Curriculum(1, "J2EE", courseData.getCoursesForJ2EE()));
        curriculumList.add(new Curriculum(2, "Frontend", courseData.getCoursesForFrontend()));
        curriculumList.add(new Curriculum(3, "Python", courseData.getCoursesForPythonDeveloper()));

    }

    public Curriculum getCurriculumById(int curriculumId) {

        return curriculumList.stream().filter(x -> x.getCurriculumId() == curriculumId).findFirst().get();

    }


}
