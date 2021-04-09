package com.github.gabrielpadilh4.operators;

public class TernaryOperators {

    public static void main(String[] args) {
        double average = 7.6;
        String result = average > 7.0 ? "Pass" : "Fail";

        System.out.printf("The student %s in the test", result);
    }
}
