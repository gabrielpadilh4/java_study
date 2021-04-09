package com.github.gabrielpadilh4.operators;

import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {

        String value1;
        String value2;
        String value3;

        double salary1;
        double salary2;
        double salary3;

        double salaryAverage;

        Scanner sc = new Scanner(System.in);

        System.out.print("First Salary: ");
        value1 = sc.nextLine().replace(",",".");

        System.out.print("Second Salary: ");
        value2 = sc.nextLine().replace(",",".");

        System.out.print("Third Salary: ");
        value3 = sc.nextLine().replace(",",".");

        salary1 = Double.parseDouble(value1);
        salary2 = Double.parseDouble(value2);
        salary3 = Double.parseDouble(value3);

        salaryAverage = (salary1 + salary2 + salary3) / 3;

        System.out.println("Average Salary is: " + salaryAverage);

        sc.close();

    }
}
