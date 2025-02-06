package com.java.dsa.stack;
import java.util.Stack;


public class ReverseString {
    public static void main(String args[]){
        String s="Hello World";
        Stack<Character> stack= new Stack<>();

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=' ') {
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
