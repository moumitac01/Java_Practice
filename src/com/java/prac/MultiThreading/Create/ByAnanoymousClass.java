package com.java.prac.MultiThreading.Create;

public class ByAnanoymousClass {
    public static void main(String args[]){
     Runnable runnable= new Runnable() {
        @Override
        public void run() {
            System.out.println("Thread Started");
            System.out.println("Thread Finished");
        }
    };

        Thread thread= new Thread(runnable);
        thread.start();
    }

}
