package com.java.dsa.stack;
import java.util.Stack;

public class ParenthesisChecker {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        // code here
        Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);

            }
            else if(c==')' || c=='}' || c==']'){
                if(st.empty())
                    return false;

                char top=st.pop();
                if((c==')' && top!='(') ||
                        (c==']' && top!='[') ||
                        (c=='}' && top!='{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    //Input: s = "{([])}"
    //Output: true
    public static void main(String args[]) {
        String s = "[(])";
        System.out.println(isParenthesisBalanced(s));
    }
}
