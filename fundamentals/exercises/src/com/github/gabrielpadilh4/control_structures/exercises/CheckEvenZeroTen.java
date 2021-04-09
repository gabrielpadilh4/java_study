package com.github.gabrielpadilh4.control_structures.exercises;

/*
    Create a program to receive a number and check if this number is
    between 0 or 10 and if it is even
 */
public class CheckEvenZeroTen {

    public static void main(String[] args) {

        int number = 10;

        boolean isEvenZeroTen = false;

        if (number >= 0 && number <= 10 && number % 2 == 0) {
            isEvenZeroTen = true;
        }

        System.out.println("Result is: " + isEvenZeroTen);

    }
}
