package com.github.gabrielpadilh4.basic.test;

import com.github.gabrielpadilh4.infra.ProductDAO;
import com.github.gabrielpadilh4.model.Product;

import java.util.List;

public class GetProducts {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();
        List<Product> products = dao.getAll();

        for (Product p: products) {
            System.out.println(p);
        }

        double totalPrice = products.stream().map(p -> p.getPrice()).reduce(0.0, (t, p) -> t + p).doubleValue();

        System.out.println("Total price is: " + totalPrice);

    }
}
