package com.github.gabrielpadilh4;

import javax.swing.*;
import java.util.Scanner;

public class ChallengeCalculator {

    public static void main(String[] args) {
        // Read two values and do math operation(+ - * /) based on user input
        // Rules: You can't use IF / ELSE for logic

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two values and the mathematical symbol operator(+ - * /)");

        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        String operator = sc.next();

        double result = 0;

        // Logic
        result = "+".equals(operator) ? number1 + number2 : result;

        result = "-".equals(operator) ? number1 - number2 : result;

        result = "*".equals(operator) ? number1 * number2 : result;

        result = "/".equals(operator) ? number1 / number2 : result;


        System.out.printf("%.2f %s %.2f = %.2f", number1, operator, number2, result);

        sc.close();
    }
}
