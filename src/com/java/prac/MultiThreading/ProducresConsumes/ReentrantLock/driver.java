package com.java.prac.MultiThreading.ProducresConsumes.ReentrantLock;

public class driver {
    public static void main(String args[]){
        ProCons proCons= new ProCons(0);
        Thread t1= new Thread(proCons,"produce");
        Thread t2= new Thread(proCons,"consumes");
        t1.start();
        t2.start();
    }
}
