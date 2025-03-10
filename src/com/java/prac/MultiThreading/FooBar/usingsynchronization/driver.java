package com.java.prac.MultiThreading.FooBar.usingsynchronization;

public class driver {
    public static void main(String[] args) {
        // Create two threads: one for "foo" and one for "bar"
        FooBar fooThread = new FooBar("Foo");
        FooBar barThread = new FooBar("Bar");

        // Start both threads
        fooThread.start();
        barThread.start();
    }
}
