package com.github.gabrielpadilh4.oo.composition;

public class CourseTest {

    public static void main(String[] args) {
        Student s1 = new Student("Gabriel");
        Student s2 = new Student("Angela");

        Course c1 = new Course("Java Complete");
        Course c2 = new Course("Web Developer");
        Course c3 = new Course("React");

        s1.addCourse(c1);
        s1.addCourse(c2);

        s2.addCourse(c2);
        s2.addCourse(c3);

        for(Course course: s2.courses){
            System.out.println(course.name);

            for (Student student: course.students) {
                System.out.println(student.name);
            }
        }
    }
}
