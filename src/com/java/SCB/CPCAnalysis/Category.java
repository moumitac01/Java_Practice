package com.java.SCB.CPCAnalysis;

import java.util.ArrayList;
import java.util.List;

public class Category implements ICategory{
    int id;
    String name;
    List<Product> products;

    public void Category(int id, String nanme){
        this.id=id;
        this.name=name;
        this.products=new ArrayList<>();
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Product> getProducts(){
        return products;
    }
}
