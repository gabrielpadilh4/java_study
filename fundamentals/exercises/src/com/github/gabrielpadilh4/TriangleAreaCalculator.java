package com.github.gabrielpadilh4;

import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Base: ");
        double base = sc.nextDouble();

        System.out.println("Height: ");
        double height = sc.nextDouble();


        double result = (base * height) / 2;

        System.out.println("Area of triangle: " + result);


        sc.close();
    }
}
