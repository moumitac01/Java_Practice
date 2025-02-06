package com.java.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinusNumbercount {
    public static void plusminus(List<Integer> arr){
        int positivecount=0,negativecount=0, zerocount=0;
        for(int i: arr){
            if(i==0){
                zerocount++;
            }
            else if(i>0){
                positivecount++;
            }
            else{
                negativecount++;
            }
        }
        //float f=zerocount/arr.size();
        System.out.println((float)zerocount/arr.size());
        System.out.println(positivecount/arr.size());
        System.out.println(negativecount/arr.size());
    }
    public static void main(String args[]){
        List<Integer> arr= new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));
        plusminus(arr);
    }

}
