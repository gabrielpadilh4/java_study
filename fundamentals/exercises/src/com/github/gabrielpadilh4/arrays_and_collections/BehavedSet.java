package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BehavedSet {

    public static void main(String[] args) {
        // Set<String> list = new HashSet<String>(); // not ordered
        SortedSet<String> list = new TreeSet<String>(); //ordered

        list.add("Gabriel");
        list.add("Carlos");
        list.add("Ed");
        list.add("Jonatan");
        list.add("Gilberto");

        for(String s: list) {
            System.out.println(s);
        }
    }
}
