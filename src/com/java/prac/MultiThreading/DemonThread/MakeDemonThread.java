package com.java.prac.MultiThreading.DemonThread;

public class MakeDemonThread extends Thread{
    public MakeDemonThread(String name) {
        super(name);
    }


    public void run(){
        System.out.println("Current Thread - "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+ " is a Demon Thread - "+Thread.currentThread().isDaemon());
    }
}
