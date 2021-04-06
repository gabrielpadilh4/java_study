package com.github.gabrielpadilh4.control_structures;

import java.util.Scanner;

public class ChallengeDayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a valid day name(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday):");

        String dayName = sc.next();

        int dayWeekNumber = 0;

        if (dayName.equalsIgnoreCase("Sunday")) {
            dayWeekNumber = 1;
        }

        if (dayName.equalsIgnoreCase("Monday")) {
            dayWeekNumber = 2;
        }

        if (dayName.equalsIgnoreCase("Tuesday")) {
            dayWeekNumber = 3;
        }

        if (dayName.equalsIgnoreCase("Wednesday")) {
            dayWeekNumber = 4;
        }

        if (dayName.equalsIgnoreCase("Thursday")) {
            dayWeekNumber = 5;
        }

        if (dayName.equalsIgnoreCase("Friday")) {
            dayWeekNumber = 6;
        }

        if (dayName.equalsIgnoreCase("Saturday")) {
            dayWeekNumber = 7;
        }

        if (dayWeekNumber == 0) {
            System.out.println("Day name invalid, enter a valid day name(Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday)");
        } else {
            System.out.printf("%s is the %d day of the week", dayName, dayWeekNumber);
        }

        sc.close();
    }
}
