package com.github.gabrielpadilh4.oo.composition;

import java.util.ArrayList;

public class Order {

    String customerName;
    ArrayList<Item> items = new ArrayList<Item>();

    double getOrderTotal(){
        double total = 0;

        for(Item item: items){
            total += item.price * item.quantity;
        }

        return total;
    }
}
