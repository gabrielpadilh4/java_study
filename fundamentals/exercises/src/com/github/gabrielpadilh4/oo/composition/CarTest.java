package com.github.gabrielpadilh4.oo.composition;

public class CarTest {

    public static void main(String[] args) {
        Car c = new Car();

        System.out.println(c.isOn());
        System.out.println(c.engine.spins());

        c.powerOn();

        System.out.println(c.isOn());

        System.out.println(c.engine.spins());

        c.breakUp();
        c.breakUp();
        c.breakUp();

        System.out.println(c.engine.spins());
    }
}
