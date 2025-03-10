package com.java.prac.MultiThreading.FooBar.Volatile;

public class driver {
    public static void main(String args[]){
        FooBar fooBar= new FooBar(5);

        Thread foo= new Thread(()->{
            try{
                fooBar.foo(() ->{System.out.println("foo");});
            }
            catch(Exception e){
            e.printStackTrace();
            }
        });

        Thread bar = new Thread(() -> {
            try{
                fooBar.bar(() -> {System.out.println("bar");});
            }
            catch(Exception e){
            e.printStackTrace();
            }
        });
        foo.start();
        bar.start();
    }
}
