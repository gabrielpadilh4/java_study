package com.github.gabrielpadilh4.control_structures;

public class DoWhile {

    public static void main(String[] args) {

        int count = 1;

        do {
            // Always will run for at least one time
            System.out.println("Teste" + count);
            count--;
        } while(count == 0); // it will run 2 times
    }
}
