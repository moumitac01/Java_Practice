package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortinReverseOrder {
    public static void main(String args[]){
        List<Integer> list= new ArrayList<>(Arrays.asList(2,45,67,23,1,298,0,12,4));

        List<Integer> reverseSortList= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortList);

        int [] arr ={2,45,67,23,1,298,0,12,4};
        List<Integer> reverseSortListarr=Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortListarr);
    }
}
