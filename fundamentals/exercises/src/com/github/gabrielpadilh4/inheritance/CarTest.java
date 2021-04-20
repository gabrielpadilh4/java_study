package com.github.gabrielpadilh4.inheritance;

public class CarTest {
    public static void main(String[] args) {

        Civic civic = new Civic();

        Corsa corsa = new Corsa();

        System.out.println(civic.CAR_NAME + " " + civic.currentSpeed);
        System.out.println(corsa.CAR_NAME + " " + civic.currentSpeed);

        civic.speedUp();
        corsa.speedUp();

        System.out.println(civic.CAR_NAME + " " + civic.currentSpeed);
        System.out.println(corsa.CAR_NAME + " " + corsa.currentSpeed);

        civic.brake();
        corsa.brake();
        corsa.brake();
        corsa.brake();
        corsa.brake();

        System.out.println(civic.CAR_NAME + " " + civic.currentSpeed);
        System.out.println(corsa.CAR_NAME + " " + corsa.currentSpeed);

    }
}
