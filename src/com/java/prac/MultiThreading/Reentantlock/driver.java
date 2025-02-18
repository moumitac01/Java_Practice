package com.java.prac.MultiThreading.Reentantlock;

import com.java.prac.MultiThreading.DemonThread.MakeDemonThread;

import java.util.concurrent.locks.ReentrantLock;

public class driver {
    public static void main(String args[]){
        ReentrantLock lock =new  ReentrantLock();

        Worker w1= new Worker(lock,"t1");
        Worker w2= new Worker(lock,"t2");
        w1.start();
        w2.start();

        WorkerHoldCount w3= new WorkerHoldCount("t3");
        WorkerHoldCount w4= new WorkerHoldCount("t4");
        w3.start();
        w4.start();
    }

}
