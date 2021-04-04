package com.github.gabrielpadilh4;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.println("Bom dia!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.printf("The number entered is: %d", number);

        System.out.print("\nThe string entered is: " + text);

        sc.close();
    }
}
