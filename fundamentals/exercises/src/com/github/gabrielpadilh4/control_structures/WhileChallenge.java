package com.github.gabrielpadilh4.control_structures;

import java.util.Scanner;

public class WhileChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double examResult = 0;
        double averageResult = 0;
        double userInput = 0;
        int counter = 0;

        do {

            System.out.println("Final Average Result");
            System.out.println("[1] - Enters one grade");
            System.out.println("[2] - Show Final Average Result");
            System.out.println("[-1] - Exit");
            System.out.print("Option: ");
            userInput = sc.nextDouble();

            if (userInput != -1 && userInput != 1 && userInput != 2) {
                System.out.println("Invalid Option");
                continue;
            }

            if (userInput == 1) {
                System.out.print("Enter a value in range 1 ... 10:");
                examResult = sc.nextDouble();

                averageResult = averageResult + examResult;

                counter++;

                continue;
            }

            if (userInput == 2) {
                System.out.println("The final result is: " + (averageResult / counter));
            }


        } while (userInput != -1);

        sc.close();

    }
}
