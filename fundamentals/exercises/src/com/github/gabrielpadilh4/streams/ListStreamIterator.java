package com.github.gabrielpadilh4.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamIterator {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Gabriel", "Julia", "Andre", "Daniel");

        for (String name:
             names) {
            System.out.println(name);
        }

        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        Stream<String> namesStream = names.stream();

        namesStream.forEach(System.out::println);

    }
}
