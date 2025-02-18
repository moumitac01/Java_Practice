package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String args[]){
        List<Integer> list =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        int max = list.stream().max(Comparator.naturalOrder()).get();
        int min = list.stream().min(Comparator.naturalOrder()).get();

        System.out.println(max+" "+min);
    }
}
