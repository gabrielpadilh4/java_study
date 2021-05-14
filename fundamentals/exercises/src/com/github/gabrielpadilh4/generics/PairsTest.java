package com.github.gabrielpadilh4.generics;

public class PairsTest {

    public static void main(String[] args) {

        Pairs<Integer, String> students = new Pairs<>();

        students.add(10, "Gabriel");
        students.add(2, "Angela");
        students.add(3, "Marcio");
        students.add(1, "Mario");
        students.add(20, "Ruan");

        System.out.println(students.getValue(20));
    }
}
