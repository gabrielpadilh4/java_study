package com.github.gabrielpadilh4.inheritance;

public class Corsa extends Car {

    // final static String CAR_NAME = "Corsa";

    Corsa(){
        super("Corsa");
    }

    void speedUp() {
        currentSpeed += 3;
    }
}
