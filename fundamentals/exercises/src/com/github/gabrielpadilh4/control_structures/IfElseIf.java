package com.github.gabrielpadilh4.control_structures;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int value = sc.nextInt();

        if (value > 10 || value < 0) {
            System.out.println("Invalid value");
        } else if (value > 8) {
            System.out.println("A");
        } else if (value > 6) {
            System.out.println("B");
        }


        sc.close();
    }
}
