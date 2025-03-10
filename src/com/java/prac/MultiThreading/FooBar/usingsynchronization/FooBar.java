package com.java.prac.MultiThreading.FooBar.usingsynchronization;

public class FooBar extends Thread {
    private static boolean isFoo=true;
    private static Object lock = new Object();

    public FooBar(String name){
        super(name);
    }
    public void run(){
        try{
            for(int i=0;i<5;i++){
                synchronized (lock){
                    if(Thread.currentThread().getName().equals("Foo")){
                        while(!isFoo){
                            lock.wait();
                        }
                        System.out.println(Thread.currentThread().getName());
                        isFoo=false;
                        lock.notify();
                    }
                    else if(Thread.currentThread().getName().equals("Bar")){
                         while(isFoo){
                             lock.wait();
                         }
                        System.out.println(Thread.currentThread().getName());
                        isFoo=true;
                        lock.notify();
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }