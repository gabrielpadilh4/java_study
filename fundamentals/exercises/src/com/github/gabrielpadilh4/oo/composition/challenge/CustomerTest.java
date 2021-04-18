package com.github.gabrielpadilh4.oo.composition.challenge;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Gabriel");
        Customer customer2 = new Customer("Angela");

        Product product1 = new Product("Pen", 0.15);
        Product product2 = new Product("Hammer", 1.25);

        Order order1 = new Order();
        order1.addItem(product1, 10);
        order1.addItem(product2, 1);

        customer1.orders.add(order1);

        System.out.println(customer1.getTotalCash());
    }
}
