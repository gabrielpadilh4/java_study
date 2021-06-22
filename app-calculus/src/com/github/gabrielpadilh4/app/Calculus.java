package com.github.gabrielpadilh4.app;

import com.github.gabrielpadilh4.app.internal.ArithmeticOperations;

public class Calculus {

    private ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    public double sum(double... numbers) {
        return arithmeticOperations.sum(numbers);
    }
}