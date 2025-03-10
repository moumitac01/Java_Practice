package com.java.prac.MultiThreading.FooBar.Volatile;

class FooBar {
    private int n;
    private volatile boolean idx = true;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (idx) Thread.yield();
            printFoo.run();
            idx = true;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (!idx ) Thread.yield();
            printBar.run();
            idx = false;
        }
    }
}