package com.github.gabrielpadilh4.operators;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        final double ADJUSTMENT = 32;
        final double FACTOR = 9 / 5.0;

        double fahrenheit;
        double celsius;

        celsius = 30;

        fahrenheit = (celsius * FACTOR) + ADJUSTMENT;

        System.out.printf("The result is %2f °F", fahrenheit);
    }
}
