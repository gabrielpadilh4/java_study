package com.github.gabrielpadilh4.model;

import javax.persistence.*;

@Entity
@Table(name = "products", schema = "java_study")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", length = 200, nullable = false)
    private String name;

    @Column(name = "product_price", nullable = false, precision = 11, scale = 2)
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
