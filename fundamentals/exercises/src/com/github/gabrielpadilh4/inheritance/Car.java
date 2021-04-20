package com.github.gabrielpadilh4.inheritance;

public class Car {

    int currentSpeed;

    final String CAR_NAME;

    Car(String name){
        this.CAR_NAME = name;
    }

    void speedUp() {
        currentSpeed++;
    }

    void brake() {
        if (currentSpeed > 0)
            currentSpeed--;
    }
}
