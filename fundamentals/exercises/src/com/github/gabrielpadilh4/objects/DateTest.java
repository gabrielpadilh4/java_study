package com.github.gabrielpadilh4.objects;

public class DateTest {

    public static void main(String[] args) {
        Date date1 = new Date();

        System.out.println(date1.toString());

        date1.day = 21;
        date1.month = 9;
        date1.year = 1996;

        System.out.println(date1.toString());
    }
}
