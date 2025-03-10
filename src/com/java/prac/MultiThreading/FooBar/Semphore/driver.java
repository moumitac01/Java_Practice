package com.java.prac.MultiThreading.FooBar.Semphore;

public class driver {
    public static void main(String args[]){
        FoorBar foorBar= new FoorBar(5);

        Thread fooThread = new Thread(() ->{
            try{
                foorBar.foo(() -> {System.out.println("foo");});
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        Thread barThread = new Thread(() -> {
            try{
                foorBar.bar(() -> {System.out.println("bar");});
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        fooThread.start();
        barThread.start();
    }

}
