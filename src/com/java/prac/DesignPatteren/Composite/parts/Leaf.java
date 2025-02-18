package com.java.prac.DesignPatteren.Composite.parts;

import com.java.prac.DesignPatteren.Composite.Components;

public class Leaf implements Components {
    String name;
    int price;


    //constructor
    public  Leaf(String name, int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public void show() {
        System.out.println(name +" " +price);
    }
}
