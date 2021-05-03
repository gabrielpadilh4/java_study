package com.github.gabrielpadilh4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> sum = (ac, n) -> ac + n;

        Integer total = numbers.stream().reduce(sum).get();

        System.out.println(total);

        Integer total1 = numbers.stream().reduce(100, sum);

        System.out.println(total1);

    }
}
