package com.github.gabrielpadilh4.control_structures;

public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // interrupts the execution
            }

            System.out.println(i);
        }
    }
}
