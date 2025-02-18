package com.java.prac.MultiThreading.Create;

public class ByRunnableINterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Started");
        System.out.println("Thread Finished");
    }
    public static void main(String args[]){
        Thread thread = new Thread(new ByRunnableINterface());
        thread.start();

    }
}
