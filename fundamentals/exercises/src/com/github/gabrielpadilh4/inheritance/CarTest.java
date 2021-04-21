package com.github.gabrielpadilh4.inheritance;

public class CarTest {
    public static void main(String[] args) {

        Civic civic = new Civic();

        Corsa corsa = new Corsa();

        System.out.println(civic.CAR_NAME + " " + civic.getCurrentSpeed());
        System.out.println(corsa.CAR_NAME + " " + civic.getCurrentSpeed());

        civic.speedUp();
        corsa.speedUp();

        System.out.println(civic.CAR_NAME + " " + civic.getCurrentSpeed());
        System.out.println(corsa.CAR_NAME + " " + corsa.getCurrentSpeed());

        civic.brake();
        corsa.brake();
        corsa.brake();
        corsa.brake();
        corsa.brake();

        System.out.println(civic.CAR_NAME + " " + civic.getCurrentSpeed());
        System.out.println(corsa.CAR_NAME + " " + corsa.getCurrentSpeed());

    }
}
