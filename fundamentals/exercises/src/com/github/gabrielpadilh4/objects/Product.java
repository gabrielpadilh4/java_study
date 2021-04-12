package com.github.gabrielpadilh4.objects;

public class Product {

    String name;
    double price;
    static double discount = 0.25;

    Product(String initialName) {
        name = initialName;
    }

    Product() {
    }

    double finalPrice() {
        return price * (1 - discount);
    }

}
