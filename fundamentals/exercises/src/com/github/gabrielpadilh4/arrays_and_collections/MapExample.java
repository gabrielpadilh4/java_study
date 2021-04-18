package com.github.gabrielpadilh4.arrays_and_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

    public static void main(String[] args) {

        // key, value
        Map<Integer, String> users = new HashMap<>();

        users.put(1,"Robert"); // add
        users.put(1,"Teste"); // update

        users.put(2,"Gabriel");
        users.put(3,"Angela");
        users.put(4,"John");

        System.out.println(users.size());

        System.out.println(users.keySet());

        System.out.println(users.isEmpty());

        System.out.println(users.values());

        System.out.println(users.entrySet());

        System.out.println(users.containsKey(1));
        System.out.println(users.containsValue("Angela"));

        System.out.println(users.get(4));

        for (int key:
             users.keySet()) {
            System.out.println(key);
        }

        for (String value:
                users.values()) {
            System.out.println(value);
        }

        for (Entry<Integer, String> record:
                users.entrySet()) {
            System.out.printf(record.getKey() + " ");
            System.out.println(record.getValue());
        }

    }
}
