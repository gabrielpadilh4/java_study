package com.github.gabrielpadilh4.control_structures.exercises;
/*
    Create a program to check if a number is prime or not
 */
public class CheckPrimeNumber {

    public static void main(String[] args) {
        int number = 20;

        boolean isPrimeNumber = false;

        if(number%2 != 0){
            isPrimeNumber = true;
        }

        System.out.println(isPrimeNumber);
    }
}
