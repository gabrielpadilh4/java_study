package com.github.gabrielpadilh4.control_structures.exercises;

/*
    Create a program to check if the current year is a leap year
 */
public class CheckLeapYear {
    /*
    Rules for a Leap Year:
    1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
    2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4
    3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
    4. The year is a leap year(it has 366 days)
    5. The year is not a leap year(it has 365 days)

    Font: Microsoft
     */
    public static void main(String[] args) {

        int year = 2024;

        boolean isLeapYear = false;

        if (year % 4 == 0) { // Step 1

            if (year % 100 == 0) { // Step 2

                if (year % 400 == 0) { // Step 3
                    isLeapYear = true;
                }

            } else {
                isLeapYear = true;
            }
        }

        System.out.println("The year is: " + (isLeapYear ? "Leap Year" : "NOT Leap Year"));
    }
}
