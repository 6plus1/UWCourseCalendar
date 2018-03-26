package com.example.sixplusone.uwcoursecalendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nelson on 2018/03/26.
 */

public class CourseData {
    public List<String> courses;
    public int minRequired;

    public CourseData(List<String> courses, int minRequired) {
        this.courses = courses;
        this.minRequired = minRequired;
    }

    public static List<CourseData> getCourseDataFor(String program){
        if(program.equals("CS"))
        return Arrays.asList(
                new CourseData(
                        Arrays.asList("CS 135", "CS 145"),
                        1
                ),
                new CourseData(
                        Arrays.asList("CS 136", "CS 146"),
                        1
                ),
                new CourseData(
                        Arrays.asList("MATH 127", "MATH 137", "MATH 147"),
                        2
                )
        );
        else return new ArrayList<>();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseData that = (CourseData) o;

        if (minRequired != that.minRequired) return false;
        return courses != null ? courses.equals(that.courses) : that.courses == null;
    }

    @Override
    public int hashCode() {
        int result = courses != null ? courses.hashCode() : 0;
        result = 31 * result + minRequired;
        return result;
    }
}
