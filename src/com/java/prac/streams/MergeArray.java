package com.java.prac.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeArray {
    public static void main(String args[]){
        int[] l1= {3,5,2,0,81,1};
        int[] l2= {31,15,12,10,88,15};

        List<Integer> list= IntStream.concat(Arrays.stream(l1), Arrays.stream(l2)).sorted().boxed().collect(Collectors.toList());
        System.out.println(list);

        List<Integer> distinctlist= IntStream.concat(Arrays.stream(l1), Arrays.stream(l2)).sorted().distinct().boxed().collect(Collectors.toList());
        System.out.println(distinctlist);

        List<Integer> list1= new ArrayList<>(Arrays.asList(3,5,2,0,81,1));
        List<Integer> list2= new ArrayList<>(Arrays.asList(31,15,12,10,88,15));

        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
