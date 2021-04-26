package com.github.gabrielpadilh4.lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Gabriel","Samuel","Deborah","Angela","Mathew");

        // Lambda #01
        names.forEach(name -> System.out.println(name));

        // Lambda #02 - Method reference
        names.forEach(System.out::println);

        // Lambda #03 - Method reference
        names.forEach(Foreach::myCustomPrint);
    }

    static void myCustomPrint(String name){
        System.out.println(name);
    }
}
