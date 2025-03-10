package com.java.prac;

public class ConcatenateInteger {
    public static void main(String args[]){
        int[] arr ={9,7,4,30};
        StringBuilder s=new StringBuilder();

        for(int i:arr){
            s.append(i);
        }
        System.out.print(s);

    }
}
