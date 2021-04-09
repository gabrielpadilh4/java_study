package com.github.gabrielpadilh4.operators;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        final double ADJUSTMENT = 32;
        final double FACTOR = 5/9.0;

        double fahrenheit;
        double celsius;

        fahrenheit = 86;

        celsius = (fahrenheit - ADJUSTMENT) * FACTOR;

        System.out.println("The result is " + celsius + "°C");

    }
}
