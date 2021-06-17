package com.github.gabrielpadilh4.basic.test.inheritance;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.inheritance.ScholarshipStudent;
import com.github.gabrielpadilh4.model.inheritance.Student;


public class StudentTest {

    public static void main(String[] args) {

        DAO<Student> studentDAO = new DAO<>();

        Student student = new Student(123L, "Gabriel");
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent(1234L, "Maria", 12.5);

        studentDAO.atomicPersist(student);
        studentDAO.atomicPersist(scholarshipStudent);

        studentDAO.close();

    }
}
