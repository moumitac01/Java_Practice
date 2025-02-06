package com.java.dsa.stack;

public class driver {
    public static void main(String args[]){
        Stack stack =new Stack();

            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            System.out.println("Elements removed from stack "+stack.pop());
            System.out.println("Top Element in stack"+stack.peek());
          //  stack.pop();
           // stack.pop();
           System.out.println("Elements present in stack");
           stack.print();
    }
}
