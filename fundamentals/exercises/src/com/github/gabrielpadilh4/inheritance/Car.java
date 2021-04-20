package com.github.gabrielpadilh4.inheritance;

public class Car {

    int currentSpeed;

    final String CAR_NAME;
    final int MAX_SPEED;

    Car(String name, int maxSpeed){
        this.CAR_NAME = name;
        this.MAX_SPEED = maxSpeed;
    }

    void speedUp() {
        if(currentSpeed == MAX_SPEED){
            return;
        }
        currentSpeed++;
    }

    void brake() {
        if (currentSpeed > 0)
            currentSpeed--;
    }
}
