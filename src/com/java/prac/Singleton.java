package com.java.prac;

public class Singleton {
    static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getinnstance(){
        if( singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
    public static void main(String args[]){
        System.out.println(getinnstance());
        System.out.println(getinnstance());


    }
}

