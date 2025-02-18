package com.java.prac.MultiThreading.Reentantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class WorkerHoldCount extends Thread{

    ReentrantLock lock = new ReentrantLock();

    public WorkerHoldCount(String name){
        super(name);
    }
    public void run(){
        try {
            for(int i=1; i<3; i++){
                if(lock.tryLock(1, TimeUnit.MICROSECONDS)){
                System.out.println("Thread "+Thread.currentThread().getName()+" has get hold of "+lock.getHoldCount());
                }
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            for(int i=1;i<3;i++){
                lock.unlock();
                System.out.println("Thread "+Thread.currentThread().getName()+" has get hold of "+lock.getHoldCount());
            }
        }
    }
}
