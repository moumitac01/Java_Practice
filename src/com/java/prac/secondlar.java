package com.java.prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class secondlar {
    public static boolean chcekPalidrome(String s, int right, int left, int k){
        while (left< right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                if(k==0) return false;
                return chcekPalidrome(s,right-1, left, k) ||
                        chcekPalidrome(s, right, left+1, k);
            }
        }
        return true;
    }
    public static void main(String args[]) {
        // Input  : String - abcdeca, K = 2
        String s= "abcdeca";

        int k =2, right =(s.length()-1), left=0;


       System.out.println(chcekPalidrome(s, right, left, k));

    }
}