package com.github.gabrielpadilh4.oo.composition;

public class Engine {

    boolean powerOn = false;
    double injectionFactor = 3;

    int spins() {
        if (!powerOn) return 0;
        return (int) Math.round(injectionFactor * 3000);
    }
}
