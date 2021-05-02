package com.github.gabrielpadilh4.streams;

public class Product {

    private String name;
    private double unitPrice;
    private double discount;
    private double freightValue;

    public Product(String name, double unitPrice, double discount, double freightValue) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.freightValue = freightValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFreightValue() {
        return freightValue;
    }

    public void setFreightValue(double freightValue) {
        this.freightValue = freightValue;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", discount=" + discount +
                ", freightValue=" + freightValue +
                '}';
    }
}
