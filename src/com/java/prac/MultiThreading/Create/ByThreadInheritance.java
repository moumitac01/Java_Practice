package com.java.prac.MultiThreading.Create;

public class ByThreadInheritance  extends Thread{
    public void run(){
        System.out.println("Thread Started");
        System.out.println("Thread Finished");
    }
    public static void main(String args[]){
        ByThreadInheritance thread = new ByThreadInheritance();
        thread.start();
    }

}
