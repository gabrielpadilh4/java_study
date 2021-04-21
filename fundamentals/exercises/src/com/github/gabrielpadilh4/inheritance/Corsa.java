package com.github.gabrielpadilh4.inheritance;

public class Corsa extends Car {

    // final static String CAR_NAME = "Corsa";

    Corsa() {
        super("Corsa", 180);
    }

    public void speedUp() {
        setCurrentSpeed(getCurrentSpeed() + 3);
    }
}
