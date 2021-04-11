package com.github.gabrielpadilh4.objects;

public class Product {

    String name;
    double price;
    double discount;

    double finalPrice() {
        return  price * (1 - discount);
    }

}
