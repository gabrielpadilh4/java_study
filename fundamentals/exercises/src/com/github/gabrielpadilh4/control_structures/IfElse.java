package com.github.gabrielpadilh4.control_structures;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Enter a number:");

        int number = Integer.parseInt(value);

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        /* This can be rewrite to this

        String result = number %2 == 0 ? "Even": "Odd";

        System.out.println(result);
         */
    }
}
