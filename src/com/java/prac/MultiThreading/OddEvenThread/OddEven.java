package com.java.prac.MultiThreading.OddEvenThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEven extends Thread {

    int num=0,MAX=10;
    ReentrantLock lock=new ReentrantLock();

    public OddEven(int i, int max){
        this.num=i;
        this.MAX=max;
    }
    Condition ev= lock.newCondition();
    Condition od= lock.newCondition();

    public void run(){

        try {
            if(lock.tryLock(1,TimeUnit.MINUTES)){
              while(num<MAX){
                  if(num%2==1 && Thread.currentThread().getName().equals("even")){
                      ev.await();
                  }
                  else if(num%2==0 && Thread.currentThread().getName().equals("odd")){
                      od.await();
                  }
                  System.out.println(Thread.currentThread().getName()+" is running " +num);
                  num++;
                  if(num%2==1){
                      od.signal();
                  }
                  else{
                      ev.signal();
                  }
              }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally{
            lock.unlock();
        }
    }


}
