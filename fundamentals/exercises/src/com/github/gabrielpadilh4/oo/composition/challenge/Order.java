package com.github.gabrielpadilh4.oo.composition.challenge;

import java.util.ArrayList;

public class Order {
    ArrayList<Item> items = new ArrayList<Item>();

    void addItem(Product product, int quantity) {
        items.add(new Item(product, quantity));
    }

    double orderTotal() {

        double total = 0;

        for (Item item : items) {
            total += item.quantity * item.product.price;
        }

        return total;

    }
}
