package com.github.gabrielpadilh4.exceptions;

public class NegativeNumberException extends RuntimeException {

    private String attributeName;
    private double number;

    public NegativeNumberException(String attributeName, double number) {
        this.attributeName = attributeName;
        this.number = number;
    }

    public String getMessage() {
        return String.format("The value %.1f of %s is negative", number, attributeName);
    }
}
