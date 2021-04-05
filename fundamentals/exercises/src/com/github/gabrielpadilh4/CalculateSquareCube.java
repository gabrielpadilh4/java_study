package com.github.gabrielpadilh4;

import java.util.Scanner;

public class CalculateSquareCube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        System.out.println("Square: " + Math.pow(value, 2));

        System.out.println("Cube: " + Math.pow(value, 3));

        sc.close();
    }

}
