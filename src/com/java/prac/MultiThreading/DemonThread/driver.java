package com.java.prac.MultiThreading.DemonThread;

public class driver {
    public static void main(String args[]){
        MakeDemonThread t1= new MakeDemonThread("t1");
        MakeDemonThread t2= new MakeDemonThread("t2");
        MakeDemonThread t3= new MakeDemonThread("t3");

        t1.setDaemon(true); // Will not create exception
        t1.start();

        t2.start();
        t2.setDaemon(true); // Will create Exception


        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
