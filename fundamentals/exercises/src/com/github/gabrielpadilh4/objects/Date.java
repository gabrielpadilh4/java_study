package com.github.gabrielpadilh4.objects;

public class Date {

    int day;
    int month;
    int year;

    final String FORMAT = "%d/%d/%d";

    Date() {
        this(1, 1, 170);
    }

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format(FORMAT, this.day, this.month, this.year);
    }

}
