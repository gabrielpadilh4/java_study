package com.github.gabrielpadilh4.exceptions;

public class Run {

    public static void main(String[] args) {
        try {

            Validate val = new Validate();

            val.setNumber(-1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
