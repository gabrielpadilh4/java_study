package com.github.gabrielpadilh4.oo.composition;

import java.util.ArrayList;
import java.util.List;

public class Student {

    final String name;
    final List<Course> courses = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    void addCourse(Course course) {
        course.students.add(this);
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
