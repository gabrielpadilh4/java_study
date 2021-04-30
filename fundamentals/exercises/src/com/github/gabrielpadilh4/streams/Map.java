package com.github.gabrielpadilh4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("bmw ", "ford ", "audi ");

        UnaryOperator<String> firstChar = str -> str.charAt(0) + "";

        brands.stream().map(brand -> brand.toUpperCase()).map(firstChar).forEach(print);

    }
}
