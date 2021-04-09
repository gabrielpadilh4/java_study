package com.github.gabrielpadilh4.control_structures.exercises;
/*
    Create a program to check if a number is prime or not
 */
public class CheckPrimeNumber {

    public static void main(String[] args) {
        int number = 607;

        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++){
            if(number%i == 0){
                isPrimeNumber = false;
            }
        }

        System.out.println(isPrimeNumber);
    }
}
