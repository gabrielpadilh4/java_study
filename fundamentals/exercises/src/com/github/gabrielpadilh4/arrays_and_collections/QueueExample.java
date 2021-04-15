package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Offer and Add -> add elements on list
        queue.add("teste"); // return false
        queue.offer("asdasdasdad"); // throw exception
        queue.offer("asdasd");
        queue.add("xcs");

        System.out.println(queue.peek()); // return false

        System.out.println(queue.element()); // throw exception

        // queue.clear();

        System.out.println(queue.poll()); // return the element and remove from list

        System.out.println(queue.poll());

        System.out.println(queue.remove());

    }
}
