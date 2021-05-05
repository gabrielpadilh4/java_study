package com.github.gabrielpadilh4.exceptions;

public class Validate {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {

        if(number < 0) throw new NegativeNumberException("number", number);

        this.number = number;
    }
}
