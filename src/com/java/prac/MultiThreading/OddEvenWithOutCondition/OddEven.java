package com.java.prac.MultiThreading.OddEvenWithOutCondition;

import java.util.concurrent.locks.ReentrantLock;

public class OddEven extends Thread{
    public static ReentrantLock lock = new ReentrantLock();
    public static int num, MAX=10;

    public OddEven(int num){
        this.num=num;
    }

    public void run(){
        while(num<MAX) {
            try {
                lock.lock();
                if (num % 2 == 0) {
                    System.out.println("Even: " + num);
                } else if (num % 2 == 1) {
                    System.out.println("Odd: " + num);
                }
                num++;
            }
            catch(Exception e){
               e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }


    }
}
