package com.java.prac.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//reverse Array
public class reverseArray {
    public static void main(String args[]){
        int[] arr ={1,2,3,4,5,6};

        List<Integer> list= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Reverse Array "+list);
    }
}
