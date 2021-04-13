package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {

        double[] elements = new double[3]; // starts with 0

        elements[0] = 1;
        elements[1] = 2;
        elements[2] = 3;

        String elementsToString = Arrays.toString(elements);

        System.out.println(elementsToString);

        double total = 0;

        for(int i = 0; i < elements.length; i++) {
            total += elements[i];
        }

        System.out.println(total);

    }
}
