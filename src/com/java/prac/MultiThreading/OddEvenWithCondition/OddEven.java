package com.java.prac.MultiThreading.OddEvenWithCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEven extends Thread{
    public static ReentrantLock lock = new ReentrantLock();
    public static int num, MAX=10;
    public static Condition ev= lock.newCondition();
    public static Condition odd= lock.newCondition();

    OddEven(int num){
        this.num=num;
    }

    public void run(){
        while(num<MAX){
            try{
                lock.lock();
                if(num%2==1 && Thread.currentThread().getName().equals("even"))  {
                    ev.await();
                }
                else if(num%2==0 && Thread.currentThread().getName().equals("odd")){
                    odd.await();
                }
                System.out.println(Thread.currentThread().getName()+ " prints- "+num);
                num++;
                if(num%2==1){
                    odd.signal();
                }
                else
                    ev.signal();
            }
            catch (Exception e){
             e.printStackTrace();
            }
            finally {
                lock.unlock();
            }

        }

    }
}
