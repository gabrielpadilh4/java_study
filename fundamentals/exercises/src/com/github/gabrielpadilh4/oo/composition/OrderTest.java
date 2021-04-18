package com.github.gabrielpadilh4.oo.composition;

public class OrderTest {

    public static void main(String[] args) {

        Order order = new Order();

        order.customerName = "Gabriel";

        order.items.add(new Item("Hammer", 1.25, 1));
        order.items.add(new Item("Nail", 0.10, 10));
        order.items.add(new Item("Table", 2, 6));

        System.out.println(order.items.size());
        System.out.println(order.getOrderTotal());
    }
}
