package com.github.gabrielpadilh4.objects;

public class ProductTest {

    public static void main(String[] args) {

        Product product1 = new Product();

        product1.name = "notebook";
        product1.price = 4356.89;
        product1.discount = 0.25;

        System.out.println(product1.name);

        double finalPrice = product1.finalPrice();

        System.out.printf("Price %.2f", finalPrice);

    }
}
