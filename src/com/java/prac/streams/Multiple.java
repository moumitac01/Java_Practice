package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiple {
    public static void main(String args[]){
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,67,8));

        List<Integer> multipleList=list.stream().map(i -> i*5).collect(Collectors.toList());
        System.out.println(multipleList);

        List<Integer> list1= new ArrayList<>(Arrays.asList(1,2,35,47,59,67,88));
        List<Integer> prevList=list1.stream().filter(i ->i%5==0).collect(Collectors.toList());
        System.out.println(prevList);
    }
}
