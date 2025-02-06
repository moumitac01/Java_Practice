package com.java.SCB.CPCAnalysis;

public class Product implements IProduct  {
    int id;
    String name;
    double price;
    public void Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
   }

}
