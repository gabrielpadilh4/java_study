package com.github.gabrielpadilh4.inheritance;

public class Car {

    public int currentSpeed;

    public final String CAR_NAME;
    private final int MAX_SPEED;

    Car(String name, int maxSpeed){
        this.CAR_NAME = name;
        this.MAX_SPEED = maxSpeed;
    }

    public void speedUp() {
        if(currentSpeed == MAX_SPEED){
            return;
        }
        currentSpeed++;
    }

    public void brake() {
        if (currentSpeed > 0)
            currentSpeed--;
    }
}
