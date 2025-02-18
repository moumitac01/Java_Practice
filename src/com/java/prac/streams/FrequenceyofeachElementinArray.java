package com.java.prac.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenceyofeachElementinArray {
    public static void main(String args[]){
        int [] arr= {1,2,3,4,5,2,3,4,5,6,7,85,6,7};

        Map<Integer, Long> m1 = Arrays.stream(arr).boxed()// Get distinct values
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()));
    }
}
