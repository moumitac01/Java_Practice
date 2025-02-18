package com.java.prac.MultiThreading.OddEvenThread;

public class driver {
    public static void main(String args[]){
        OddEven oddEven= new OddEven(0,10);

        Thread t1= new Thread(oddEven,"even");
        Thread t2= new Thread(oddEven,"odd");
        t1.start();
        t2.start();
    }
}
