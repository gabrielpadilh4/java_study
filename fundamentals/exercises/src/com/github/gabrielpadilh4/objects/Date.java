package com.github.gabrielpadilh4.objects;

public class Date {

    int day;
    int month;
    int year;

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }

}
