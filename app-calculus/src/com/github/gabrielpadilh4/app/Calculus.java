package com.github.gabrielpadilh4.app;

import com.github.gabrielpadilh4.Logger;
import com.github.gabrielpadilh4.app.internal.ArithmeticOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculus {

    private ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    public double sum(double... numbers) {

        String infoNumbers = "";

        for (Double n :
                numbers) {
            if (infoNumbers.trim().isEmpty()) {
                infoNumbers += "" + n;
                continue;
            }
            infoNumbers += " + " + n;
        }

        Logger.info("Sum the numbers: " + infoNumbers);
        return arithmeticOperations.sum(numbers);
    }

}