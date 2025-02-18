package com.java.prac.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
//Sum Average of Array
public class SumAvgArray {
    public static void main(String args[]){
        int [] arr={1,2,3,4,5};

        int sum= Arrays.stream(arr).sum();
        OptionalDouble avg = Arrays.stream(arr).average();

        System.out.println("Sum: "+sum +" Average: "+avg.getAsDouble());

    }
}
