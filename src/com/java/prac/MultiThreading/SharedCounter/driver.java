package com.java.prac.MultiThreading.SharedCounter;

public class driver {
    public static void main(String args[]){
        SharedCounter sharedCounter= new SharedCounter(0);
        Thread t1= new Thread(sharedCounter, "T1");
        Thread t2= new Thread(sharedCounter, "T2");
        Thread t3= new Thread(sharedCounter, "T3");
        Thread t4= new Thread(sharedCounter, "T4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
