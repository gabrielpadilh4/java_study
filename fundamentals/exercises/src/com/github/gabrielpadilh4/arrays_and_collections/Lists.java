package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User("Gabriel"));
        list.add(new User("Robert"));
        list.add(new User("John"));
        list.add(new User("Angela"));
    }
}
