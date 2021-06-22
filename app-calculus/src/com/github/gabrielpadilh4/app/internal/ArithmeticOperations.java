package com.github.gabrielpadilh4.app.internal;

import java.util.Arrays;

public class ArithmeticOperations {

    public double sum(double... numbers){
        return Arrays.stream(numbers).reduce(0.0, (t, a) -> t + a);
    }

}
