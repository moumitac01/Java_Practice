package com.java.dsa.queue;

import java.util.Stack;

public class queueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2= new Stack<>();

    public void enqueue(int i){
        //Move all element of stack1 to stack2
        while(!stack1.isEmpty()){
        stack2.push(stack1.pop());
        }
        stack1.push(i);
       //Move all element of stack2 to stack1
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public int dequeue(){
        if(stack1.isEmpty()){
            return -1;
        }
        else{
            int x= stack1.peek();
            stack1.pop();
            return x;
        }

    }
    public static void main(String args[]){
        queueUsingStack queue= new queueUsingStack();
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
