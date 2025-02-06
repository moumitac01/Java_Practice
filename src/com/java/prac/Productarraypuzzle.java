package com.java.prac;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Productarraypuzzle {
    public static int[] findProductarraypuzzle(int arr[]){
        int result[] =new int[arr.length];
        int leftarr[] = new int[arr.length];
        int rightarr[]= new int[arr.length];

        leftarr[0]=1;
        rightarr[arr.length-1]=1;//rightarr[4]=1
        for(int i=1;i<arr.length;i++){
            leftarr[i]=leftarr[i-1]*arr[i-1];
            rightarr[arr.length-(i+1)]=rightarr[arr.length-i]*arr[(arr.length)-i];

        }
       for(int i=0;i<result.length;i++){
           result[i]=leftarr[i]*rightarr[i];
       }

        return result;
    }
    public static void main(String args[]){
        int[] arr = {10, 3, 5, 6, 2};
        int[] result=findProductarraypuzzle(arr);
        for(int i: result)
        System.out.println(i);
    }
}
