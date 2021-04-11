package com.github.gabrielpadilh4.objects;

public class Product {

    String name;
    double price;
    double discount;

    Product(String initialName) {
        name = initialName;
    }

    Product() {
    }

    double finalPrice() {
        return price * (1 - discount);
    }

}
