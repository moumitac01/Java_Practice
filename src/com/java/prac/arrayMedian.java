package com.java.prac;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class arrayMedian {
    public static void main(String args[]){
        List<Integer> arr= new ArrayList<>(Arrays.asList(0,1,2,4,6,5,3));
        List<Integer> newarr=arr.stream().sorted().collect(Collectors.toList());
        int median =newarr.get(arr.size()/2);
        System.out.println(median);
    }
}
