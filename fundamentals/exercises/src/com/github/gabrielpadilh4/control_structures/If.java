package com.github.gabrielpadilh4.control_structures;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        if (value >= 7) {
            System.out.println("enter here");
        }

        sc.close();

    }
}
