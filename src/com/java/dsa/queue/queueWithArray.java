package com.java.dsa.queue;

public class queueWithArray {
    int top,down, capacity=10;
    int[] arr=new int [capacity];

    //Constructer
    public queueWithArray(){
        top=-1;
        down =0;
    }

    boolean isEmpty(){
       if(top==-1){
          return true;
       }
       else
        return false;
    }

    boolean isFull(){
        if(top==(capacity-1)){
            return true;
        }
        else{
            return false;
        }
    }


    public void add(int i){
        if(isFull()){
        System.out.println("Queue is Full");
        }
        else{
            arr[++top]=i;
        }
    }


    public int peek(){
       if(isEmpty()){
           System.out.println("Queue is empty");
       }
        return arr[down];
    }


    public int pop(){
        if(isEmpty()){
        System.out.println("Queue is empty");
        }
          return arr[down++];
    }

    public void print(){
        for(int i: arr){
            System.out.print(i );
        }

    }

}
