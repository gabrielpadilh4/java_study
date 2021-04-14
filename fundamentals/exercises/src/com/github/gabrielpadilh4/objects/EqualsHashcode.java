package com.github.gabrielpadilh4.objects;

public class EqualsHashcode {

    public static void main(String[] args) {
        User u1 = new User();
        u1.email = "gabrielpadilhasantos@gmail.com";
        u1.name = "gabriel";

        User u2 = new User();
        u2.email = "gabrielpadilhasantos@gmail.com";
        u2.name = "gabriel";

        System.out.println(u1.equals(u2)); // false

        System.out.println(u1.equals(u2)); // true, after implement equals
    }
}
