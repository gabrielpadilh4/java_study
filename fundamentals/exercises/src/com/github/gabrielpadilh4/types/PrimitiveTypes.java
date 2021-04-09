package com.github.gabrielpadilh4.types;

public class PrimitiveTypes {

    public static void main(String[] args) {

        byte yearsOfService = 23;
        short numberOfFlights = 542;
        int id = 56789;
        long points = 3123484223L; //literal

        float salary = 1.44F;
        double sells = 2991797103.01;

        boolean isOnVacation = false;

        char status = 'A';


        // Days of Service
        System.out.println(yearsOfService * 365);

        // Number of Flights
        System.out.println(numberOfFlights / 2);

        // Points
        System.out.println(points / sells);

        System.out.println(id + ": compensations -> " + salary);

        System.out.println("Vaction ?" + (isOnVacation ? "yes" : "no"));

    }
}
