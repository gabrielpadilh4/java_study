package com.github.gabrielpadilh4;

public class LogicOperators {

    public static void main(String[] args) {

        boolean condition1 = true;

        boolean condition2 = 3 > 7;

        System.out.println(condition1 && condition2); // AND
        System.out.println(condition1 || condition2); // OR
        System.out.println(condition1 ^ condition2); // XOR
        System.out.println(!condition2); // NOT
    }
}
