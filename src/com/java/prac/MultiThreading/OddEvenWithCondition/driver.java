package com.java.prac.MultiThreading.OddEvenWithCondition;

public class driver {
    public static void main(String args[]){
        OddEven oddEven= new OddEven(0);
        Thread even= new Thread(oddEven,"even");
        Thread odd = new Thread(oddEven, "odd");
        even.start();
        odd.start();


    }
}
