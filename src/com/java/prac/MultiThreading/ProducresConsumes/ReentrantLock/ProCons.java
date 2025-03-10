package com.java.prac.MultiThreading.ProducresConsumes.ReentrantLock;


import java.util.concurrent.locks.ReentrantLock;

public class ProCons extends Thread {
    public static final ReentrantLock lock= new ReentrantLock();
    public static int count;
    public static int conscount;
    private static boolean isProduced=false;

    public ProCons(int count){
        ProCons.count =count;
    }

    public static void producer(){
        count ++;
        isProduced=true;
        System.out.println(Thread.currentThread().getName()+" is producing "+count);
    }
    public static void consumer(){
        if(isProduced) {
            conscount = count;
            isProduced = false;
            System.out.println(Thread.currentThread().getName()+ " is producing "+conscount);
        }
    }
    public void run() {
        synchronized (this) {
            try {
                lock.lock();
                if (Thread.currentThread().getName().equals("produce")) {
                    while (isProduced) {
                            wait();
                    }
                    producer();
                    notify();

                } else if (Thread.currentThread().getName().equals("consumes")) {
                    while (!isProduced) {
                            wait();
                    }
                    consumer();
                        notify();

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
