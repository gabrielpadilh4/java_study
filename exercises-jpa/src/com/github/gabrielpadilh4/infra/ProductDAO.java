package com.github.gabrielpadilh4.infra;

import com.github.gabrielpadilh4.model.Product;

public class ProductDAO extends DAO<Product> {

    public ProductDAO() {
        super(Product.class);
    }
}
