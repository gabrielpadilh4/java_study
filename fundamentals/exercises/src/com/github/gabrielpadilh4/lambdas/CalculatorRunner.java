package com.github.gabrielpadilh4.lambdas;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator sum = (x,y) -> x + y; // explicit return

        System.out.println(sum.execute(10, 5));

        Calculator customOperation = (x,y) -> {

            double times = 100;

            times = (x + y) * times;

            return times;
        };

        System.out.println(customOperation.execute(10, 5));

    }
}
