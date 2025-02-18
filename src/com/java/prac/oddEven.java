package com.java.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class oddEven {
    public static void main(String args[]){
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> oddList= list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
        List<Integer> evenList=list.stream().filter(i -> i%2==0).collect(Collectors.toList());
    System.out.println(oddList+" "+evenList);
    }
}
