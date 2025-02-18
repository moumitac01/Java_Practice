package com.java.prac.streams;

public class Palidrome {
    public static boolean intPalidrome(int num){
        int originalnum=num;
     int reverseint=0;
     boolean isPalidrome=false;

     while(num!=0){
         reverseint=(reverseint*10)+num%10;
         num=num/10;
     }
     if(originalnum==reverseint) {
         isPalidrome = true;
     }
        return isPalidrome;
    }
    public static boolean stringPalidrome(String s){
        boolean isPalidrome=false;

        String reverseString=new StringBuilder(s).reverse().toString();

        if(reverseString.equals(s)){
            isPalidrome= true;
        }
        return isPalidrome;
    }
    public static void main(String args[]){
        String s="madam";
        int num=121;

        System.out.println(intPalidrome(num));
        System.out.println(stringPalidrome(s));

    }
}
