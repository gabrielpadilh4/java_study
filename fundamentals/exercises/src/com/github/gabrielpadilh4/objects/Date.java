package com.github.gabrielpadilh4.objects;

public class Date {

    int day;
    int month;
    int year;

    Date() {
        day = 1;
        month = 1;
        year = 1970;
    }

    Date(int initialDay, int initialMonth, int initialYear) {

        day = initialDay;
        month = initialMonth;
        year = initialYear;
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }

}
