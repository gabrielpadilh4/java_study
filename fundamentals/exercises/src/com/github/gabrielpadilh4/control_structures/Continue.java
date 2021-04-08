package com.github.gabrielpadilh4.control_structures;

public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 1) {
                continue; // jumps to next loop
            }

            System.out.println(i);
        }

    }
}
