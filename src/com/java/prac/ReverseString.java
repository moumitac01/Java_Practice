package com.java.prac;

public class ReverseString {
    public static void main(String args[]){
        String s="Reverse Reverse";
        StringBuilder reverse=new StringBuilder();
       for(int i=s.length()-1; i>=0;i--){
            reverse.append(s.charAt(i));
       }
       System.out.println("Reverse String "+reverse);
    }

}
