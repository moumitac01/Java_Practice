package com.java.prac.streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestinArray {
    public static void main(String args[]){
        int [] arr= {23,45,2,1,3,57,56,87};

        int secondlargest= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondlargest);
    }
}
