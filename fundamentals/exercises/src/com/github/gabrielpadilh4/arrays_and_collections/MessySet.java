package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.HashSet;
import java.util.Set;

public class MessySet {

    public static void main(String[] args) {

        HashSet set = new HashSet();

        set.add(1.2); // double -> Double
        set.add(true); // boolean -> Boolean
        set.add("test");
        set.add(1); // int -> Integer

        System.out.println(set.size());

        set.add(1);

        System.out.println(set.size()); // don't accept repeated values

        System.out.println(set.remove(1));

        System.out.println(set.size());

        System.out.println(set.contains(1));

        Set numbers = new HashSet();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);
        System.out.println(set);

        set.addAll(numbers); // union of sets

        System.out.println(set);

        set.retainAll(numbers); // intersection

        System.out.println(set);

    }
}
