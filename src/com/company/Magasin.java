package com.company;

import com.company.Product;
import interfaces.Filtering;

import java.util.*;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class Magasin  {
    Filter filter;

    private static int count=0;
    private final int capacity=50;
    private  int id;
    private String adress;
    List<Product> productlist=new ArrayList<>();


    public Magasin( String adress) {
        this.adress = adress;
        this.count++;
        this.id=count;
    }

    public int getId() {
        return id;
    }



    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addProduct(String name,int price) throws Exception {
        if(productlist.size()==capacity){
            throw new Exception("you cant add another product:out of capacity");
        }
        else{
            if(price<0 ){
                throw new Exception("you cant add a negative price !");
            }else {
                productlist.add(new Product(name,price));
            }
        }

    }





}
