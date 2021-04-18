package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.ArrayDeque;
import java.util.Deque;

// LIFO
public class StackExample {

    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<String>();

        books.add("Bible");
        books.push("Narnia");
        books.push("The Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.poll());

        System.out.println(books.pop());
    }
}
