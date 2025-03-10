package com.java.prac.MultiThreading.ProducresConsumes.usingsynchronization;

public class proscons extends Thread{
    private static int count=0;
    private static boolean isProduce=false;

    public proscons(String name){
        super(name);
    }

    private static void produce(){
        count++;
        isProduce=true;
        System.out.println(Thread.currentThread().getName()+" is producing "+count);
    }
    private static void consume(){
        if(isProduce) {
            //int conscount = count;
            isProduce = false;
            System.out.println(Thread.currentThread().getName() + " is producing " + count);
        }
    }
    public void run(){
            synchronized (this){
                try{
                if(Thread.currentThread().getName().equals("Pro")){
                    while(isProduce){
                        wait();
                    }
                    produce();
                    notify();
                }
                else if(Thread.currentThread().getName().equals("Con")){
                    while(!isProduce){
                        wait();
                    }
                    consume();
                    notify();
                }
            } catch(Exception e){
                 e.printStackTrace();
                }
            }
    }
}
