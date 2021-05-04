package com.github.gabrielpadilh4.exceptions;

import com.github.gabrielpadilh4.oo.composition.Student;

public class Basic {

    public static void main(String[] args) {

        Student a = null;

        try{
            printStudent(a);
        } catch(Exception e){
            e.printStackTrace();
        }


        try{
            System.out.println(7 / 0);
        } catch(Exception e){
            System.out.println("Something wrong happened");
        }


    }

    public static void printStudent(Student student) {
        System.out.println(student.getName());
    }
}
