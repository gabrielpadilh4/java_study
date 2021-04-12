package com.github.gabrielpadilh4.objects;

public class ProductTest {

    public static void main(String[] args) {

        Product product1 = new Product("notebook");

        product1.price = 4356.89;

        Product.discount = 0.35; // Change the class value for all instances

        // product1.discount = 0.35; It change the value of class for all instances

        System.out.println(product1.name);

        double finalPrice = product1.finalPrice();

        System.out.printf("Price %.2f", finalPrice);

    }
}
