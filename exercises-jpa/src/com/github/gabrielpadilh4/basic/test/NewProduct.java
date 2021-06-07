package com.github.gabrielpadilh4.basic.test;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.Product;

public class NewProduct {

    public static void main(String[] args) {

        Product p = new Product("Pen", 1.5);

        DAO<Product> dao = new DAO<>(Product.class);

        dao.openTransaction().persist(p).closeTransaction();

        // atomic

        Product p1 = new Product("Bottle", 5.05);

        dao.atomicPersist(p1).close();

        System.out.println("Product ID: " + p1.getId());
    }
}
