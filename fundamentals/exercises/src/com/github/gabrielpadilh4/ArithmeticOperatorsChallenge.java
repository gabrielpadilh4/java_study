package com.github.gabrielpadilh4;

public class ArithmeticOperatorsChallenge {

    public static void main(String[] args) {

        double A = 3;
        double B = 2;

        double expression1 = Math.pow(6 * (A + B), B) / (A * B);

        System.out.println("Part1: " + expression1);

        double expression2 = Math.pow(((1 - 5) * (B - 7)) / 2, B);

        System.out.println("Part2: " + expression1);

        double expression3 = Math.pow(expression1 - expression2, A);

        System.out.println("Part3: " + expression1);

        double result = expression3 / Math.pow(10, A);

        System.out.println("The result is: " + result);

    }
}
