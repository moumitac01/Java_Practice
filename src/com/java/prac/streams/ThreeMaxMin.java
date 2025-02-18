package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxMin {
    public static void main(String args[]){
        List<Integer> list= new ArrayList<>(Arrays.asList(0, 1, 2, 3, 5, 10, 12, 15, 15, 31, 81, 88));
        List<Integer> threeMinList= list.stream().sorted().limit(3).collect(Collectors.toList());
        List<Integer> threeMaxList= list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        System.out.println(threeMaxList);
        System.out.println(threeMinList);
    }
}
