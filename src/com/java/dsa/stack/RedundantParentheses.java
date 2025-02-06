package com.java.dsa.stack;

import java.util.Stack;

public class RedundantParentheses {

    public static int checkRedundancy(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);

            if(c==')'){
                char top=stack.pop();
                boolean hasOperator= false;
                while(top!='('){
                    if(top=='+'|| top=='-'||top=='*' || top=='/'){
                         hasOperator = true;
                    }
                    top=stack.pop();
                    }
                if(!hasOperator){
                    return 1;
                }
            }
            else{
                stack.push(c);
            }
        }
    return 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkRedundancy("((a+b))"));  // Output: 1 (Yes, redundant as ((a+b)) --> (a+b))
        System.out.println(checkRedundancy("(a+b+(c+d))"));  // Output: 0 (No, not redundant this will not)
    }
}

