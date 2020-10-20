package com.company;

import interfaces.Filtering;

import java.util.List;

public class Product  {
    private String name;
    private int price;
    private int idMagasin;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
