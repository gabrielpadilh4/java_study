package com.github.gabrielpadilh4.oo.composition;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String name;
    List<Student> students = new ArrayList<>();

    Course(String name){
        this.name = name;
    }

    void addStudent(Student student){
        student.courses.add(this);
        this.students.add(student);
    }
}
