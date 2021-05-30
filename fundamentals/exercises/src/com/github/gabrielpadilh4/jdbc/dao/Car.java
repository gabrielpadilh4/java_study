package com.github.gabrielpadilh4.jdbc.dao;

public class Car {

    private int code;
    private String name;
    private String brand;
    private int year;

    public Car(String name, String brand, int year) {
        this.name = name;
        this.brand = brand;
        this.year = year;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
