package com.github.gabrielpadilh4.inheritance;

public class Civic extends Car {

    //final static String CAR_NAME = "Civic";

    Civic(){
        super("Civic", 250);
    }

    void speedUp() {
        currentSpeed += 10;
    }
}
