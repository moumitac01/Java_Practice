package com.java.prac;

public class powerofNum {
    public static boolean isPowerOften(int i, int k){
        if(i<=0) return false;
        while(i%k==0){
            i/=k;
        }
        return i==1;
    }
    public static void main(String args[]){
        int i=35;
        int k=5;
        System.out.println(isPowerOften(i,k));
    }
}
