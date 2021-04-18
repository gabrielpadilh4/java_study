package com.github.gabrielpadilh4.oo.composition;

public class Car {

    Engine engine = new Engine();

    void speedUp() {
        engine.injectionFactor += 0.4;
    }

    void breakUp() {
        engine.injectionFactor += 0.4;
    }

    void powerOn() {
        engine.powerOn = true;
    }

    void powerOff() {
        engine.powerOn = false;
    }

    boolean isOn() {
        return engine.powerOn;
    }
}
