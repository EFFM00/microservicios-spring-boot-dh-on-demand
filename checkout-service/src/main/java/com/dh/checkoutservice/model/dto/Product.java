package com.dh.checkoutservice.model.dto;

public class Product {
    private String id;
    private String name;
    private Double price;
    private String instance;
    public Product() {
    }

    public Product(String id, String name, Double price, String instance) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.instance = instance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }
}
