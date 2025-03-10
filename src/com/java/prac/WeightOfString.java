package com.java.prac;

public class WeightOfString {
    public static int sum(String s){
        int sum=0;
        for(char c: s.toLowerCase().toCharArray()){
            if(Character.isLetter(c))
                sum=sum+(c-'a'+1);
        }
        return sum;
    }
    public static void main(String args[]){
        String s="Apple";
        System.out.println(sum(s));
    }
}
