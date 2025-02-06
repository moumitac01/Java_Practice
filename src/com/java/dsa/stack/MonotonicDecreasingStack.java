package com.java.dsa.stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MonotonicDecreasingStack {
    public static Stack<Integer> monotonicDecreasingStack(int arr[]){
        Stack<Integer> stack= new Stack<>();
        Stack<Integer> monoDesStack= new Stack<>();
        for(int i: arr) {
            while (!stack.isEmpty() && i> stack.peek()) {
            stack.pop();
            }
            if(!stack.isEmpty()){
                monoDesStack.push(stack.peek());
            }
            else{
                monoDesStack.push(-1);
            }
            stack.push(i);
        }
        return monoDesStack;
    }
    public static void main(String args[]){
        int arr[]={3, 1, 4, 1, 5, 9, 2, 6};
        Stack<Integer> monoDesStack=monotonicDecreasingStack(arr);
        System.out.print(monoDesStack);
    }
}
