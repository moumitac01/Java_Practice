package com.java.prac.MultiThreading.Create;

public class ByLamda {

    public static void main(String args[]){
        Runnable runnable=() ->{
            System.out.println("Thread Started");
            System.out.println("Thread Finished");
        };
          Thread thread = new Thread(runnable);
          thread.start();
    }
}
