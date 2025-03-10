package com.java.prac.MultiThreading.SharedCounter;

import java.util.concurrent.locks.ReentrantLock;

public class SharedCounter extends Thread {
    public static final ReentrantLock lock = new ReentrantLock();
    public static int num;

    public SharedCounter(int num) {
        this.num = num;
    }

    public void run(){
        try{
            lock.lock();
            System.out.println(Thread.currentThread().getName()+" has num "+num);
            num++;

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }
}
