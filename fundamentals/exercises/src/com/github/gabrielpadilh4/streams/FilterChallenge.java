package com.github.gabrielpadilh4.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterChallenge {

    public static void main(String[] args) {

        Product product1 = new Product("Pen", 1.25, 0.35, 10);
        Product product2 = new Product("Car", 12000, 0.2, 0);
        Product product3 = new Product("Rice", 0.25, 0.0, 20);
        Product product4 = new Product("Beans", 0.30, 0.5, 123);
        Product product5 = new Product("Chocolate", 5, 0.7, 0);
        Product product6 = new Product("Refrigerant", 7, 0.2, 0);

        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5, product6);

        Predicate<Product> hasFreeFreight = product -> product.getFreightValue() == 0.0;

        Consumer<Product> printProducts = System.out::println;

        products.stream().filter(hasFreeFreight).forEach(printProducts);

    }
}
