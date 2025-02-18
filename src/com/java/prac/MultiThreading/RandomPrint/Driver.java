package com.java.prac.MultiThreading.RandomPrint;

public class Driver {
    public static void main(String args[]){
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();

        t1.start();
        t2.start();
    }


}
