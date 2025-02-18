package com.java.dsa.queue;

public class driver {
    public static void main(String args[]){
        queueWithArray queue= new queueWithArray();

        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println("Top value "+queue.peek());
        System.out.println("Deleted element "+ queue.pop());
        System.out.println("Top value "+queue.peek());
        System.out.println("Deleted element "+queue.pop());

        queue.print();

    }
}
