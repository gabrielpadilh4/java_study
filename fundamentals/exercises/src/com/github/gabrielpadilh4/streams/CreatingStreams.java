package com.github.gabrielpadilh4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java", "Lua", "Javascript");

        langs.forEach(print);

        String[] moreLangs = {"Python", "Lisp", "Go"};

        Stream.of(moreLangs).forEach(print);

        Arrays.stream(moreLangs).forEach(print);

        Arrays.stream(moreLangs, 1, 2).forEach(print);

        List<String> otherLangs = Arrays.asList("C", "C#", "Perl");

        otherLangs.stream().forEach(print);

        otherLangs.parallelStream().forEach(print);

        // Stream.generate(() -> "A").forEach(print);
        Stream.iterate(0, (number) -> number + 1).forEach(print);

    }
}
