package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.Scanner;

/*
    Get values from user and create an array to calculate the sum and the average of the elements
 */
public class ArrayChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many values do you want to input ?");
        int arraySize = sc.nextInt();

        double[] values = new double[arraySize];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Value " + (i + 1) + " :");
            values[i] = sc.nextDouble();
        }

        // sum
        double sum = 0;

        for (double element: values) {
            sum += element;
        }

        System.out.println("The sum is: " + sum);

        // average
        double average = sum / values.length;

        System.out.println("The average is: " + average);

        sc.close();
    }
}
