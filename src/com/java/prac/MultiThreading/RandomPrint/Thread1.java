package com.java.prac.MultiThreading.RandomPrint;

public class Thread1 extends Thread{
    public void run(){
        for (int i=0; i< 5;i++){
            System.out.println("Thread1");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
