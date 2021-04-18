package com.github.gabrielpadilh4.oo.composition.challenge;

import java.util.ArrayList;

public class Customer {

    String name;
    ArrayList<Order> orders = new ArrayList<Order>();

    Customer(String name){
        this.name = name;
    }

    double getTotalCash(){

        double total = 0;

        for(Order order: orders){
            total += order.orderTotal();
        }

        return total;
    }
}
