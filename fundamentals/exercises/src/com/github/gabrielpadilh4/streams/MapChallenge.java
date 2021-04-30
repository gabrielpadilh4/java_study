package com.github.gabrielpadilh4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapChallenge {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(numbers);

        /* Revert binary String */
        UnaryOperator<String> reverseString = str -> new StringBuilder(str).reverse().toString();

        /* Convert reverted binary string into integer */
        Function<String, Integer> binaryToInteger = str -> Integer.parseInt(str,2);

        numbers.stream()
                .map(Integer::toBinaryString)
                .map(reverseString)
                .map(binaryToInteger)
                .forEach(System.out::println);

    }
}
