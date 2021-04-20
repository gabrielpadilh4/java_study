package com.github.gabrielpadilh4.inheritance;

public class Car {

    int currentSpeed;

    void speedUp() {
        currentSpeed++;
    }

    void brake() {
        if (currentSpeed > 0)
            currentSpeed--;
    }
}
