package com.github.gabrielpadilh4.inheritance;

public class Car {

    private int currentSpeed;

    protected final String CAR_NAME;
    protected final int MAX_SPEED;

    Car(String name, int maxSpeed) {
        this.CAR_NAME = name;
        this.MAX_SPEED = maxSpeed;
    }

    protected void speedUp() {
        if (getCurrentSpeed() == MAX_SPEED) {
            return;
        }
        setCurrentSpeed(getCurrentSpeed() + 1);
    }

    protected void brake() {
        if (getCurrentSpeed() > 0)
            setCurrentSpeed(getCurrentSpeed() - 1);
    }

    protected void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    protected int getCurrentSpeed() {
        return currentSpeed;
    }
}
