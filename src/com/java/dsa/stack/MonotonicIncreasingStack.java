package com.java.dsa.stack;
import java.util.Stack;

public class MonotonicIncreasingStack {
    public static Stack<Integer> monotonicStack(int arr[]){
        Stack<Integer> stack= new Stack<>();
        for(int i: arr){
        while(!stack.isEmpty() && i<stack.peek()){
            stack.pop();
          }
        stack.push(i);
        }

//        int result[]=new int[stack.size()];
//        int index=stack.size()-1;
//        while(!stack.isEmpty()){
//            result[index--]=stack.pop();
//        }
        return stack;
    }
    public static void main(String args[]){
        int arr[]={3, 1, 4, 1, 5, 9, 2, 6};
        Stack<Integer> result=monotonicStack(arr);
      //  for(int i: result){
            System.out.println(result);
       // }
    }
}
