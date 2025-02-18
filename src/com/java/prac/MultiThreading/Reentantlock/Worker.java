package com.java.prac.MultiThreading.Reentantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Worker extends Thread{

    ReentrantLock lock;
    //String name;
    int c=0;

    Worker (ReentrantLock lock, String name){
        super(name);
        this.lock=lock;
    }
    Condition ev = lock.newCondition();
    Condition od = lock.newCondition();
    public void run(){

          for (int i = 1; i < 3; i++) {
              try {
                  lock.lock();
                  System.out.println(Thread.currentThread().getName()+" Acquiring Lock");
                  System.out.println(Thread.currentThread().getName()+" get hold count - "+ lock.getHoldCount());
              }
              finally {
                  lock.unlock();
                  System.out.println(Thread.currentThread().getName()+" Releasing Lock");
              }
          }

    }
}
