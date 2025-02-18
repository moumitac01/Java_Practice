package com.java.prac.streams;

public class SumofallDigitsofnumber {
    public static void main(String args[]){
        int in=12345;

        int digisum=String.valueOf(in).chars().map(i -> i-'0').sum();
        System.out.println(digisum);
    }
}
