package com.java.dsa.queue;

import java.util.Stack;

public class Queue {
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2= new Stack<>();
    public  void enqueue(int i){
        stack1.push(i);
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    public  int dequeue(){
        if(stack2.isEmpty()){
         return -1;
        }
        else{
            int x=stack2.peek();
            stack2.pop();
            return x;
        }
    }
    public static void main(String args[]){
        Queue queue= new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

}
