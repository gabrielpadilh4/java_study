package com.github.gabrielpadilh4.operators;

import java.util.Scanner;

public class CalculateIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Weight: ");
        double weight = sc.nextInt();

        System.out.println("Height: ");
        double height = sc.nextDouble();

        double imc = weight / Math.pow(height,2);

        System.out.printf("Your IMC is: %.2f", imc);

        sc.close();
    }
}
