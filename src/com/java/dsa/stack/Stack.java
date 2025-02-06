package com.java.dsa.stack;

public class Stack {
    int top;
    int capacity=1000;
    int[] arr= new int[capacity];
    //Constructer
    Stack(){
        top=-1;
    }

    boolean isEmpty(){
        return (top<0);
    }

    boolean isFull(){
        return(top==(capacity-1));
    }

    int peek(){
     if(top<0){
       System.out.println("Stack is underflow");
     }
     return arr[top];
    }

    int pop(){
    if(top<0){
        System.out.println("Stack is underflow");
    }
    return arr[top--];
    }

    boolean push(int x){
        if (top>=(capacity-1)){
            System.out.println("Stack is overflow");
            return false;
        }
        else {
            arr[++top] = x;
            System.out.println("Elements pushed into stack "+x );
            return true;
        }
    }

    void print(){
        for(int i=top; i>-1;i--){
            System.out.println(" "+ arr[i]);
        }
    }
}
