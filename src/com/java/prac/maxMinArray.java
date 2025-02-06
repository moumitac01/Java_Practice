package com.java.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxMinArray {
    public static void findmaxmin(List<Integer> arr) {
        long sum=0;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i: arr){
            sum+=i;
            if(i<min){
                min=i;
            }
            else if(i>max){
                max=i;
            }
        }
        System.out.println((sum-max)+ " "+(sum-min));
    }
    public static void main(String args[]){
        //List<Integer> arr= new ArrayList<>(Arrays.asList(1,3,5,7,9));
        List<Integer> arr = new ArrayList<>(Arrays.asList(7 ,69 ,2 ,221, 8974));
        //List<Integer> arr = new ArrayList<>(Arrays.asList(256741038, 623958417 ,467905213 ,714532089, 938071625));
        findmaxmin(arr);
    }
}
