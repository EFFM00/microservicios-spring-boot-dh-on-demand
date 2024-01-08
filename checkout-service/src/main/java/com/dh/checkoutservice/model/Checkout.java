package com.dh.checkoutservice.model;


import java.util.List;

public class Checkout {
    private String id;
    private String url;
    private String totalAmount;
    private List<String> availableMethods;

    public Checkout(String id, String url, String totalAmount, List<String> availableMethods) {
        this.id = id;
        this.url = url;
        this.totalAmount = totalAmount;
        this.availableMethods = availableMethods;
    }

    public Checkout(String id) {
        this.id = id;
    }

    public Checkout() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<String> getAvailableMethods() {
        return availableMethods;
    }

    public void setAvailableMethods(List<String> availableMethods) {
        this.availableMethods = availableMethods;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", availableMethods=" + availableMethods +
                '}';
    }

}