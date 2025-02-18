package com.java.prac.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateelementofArray {

    public static void main(String args[]){
        String[] arr = {"ann", "above", "ann", "below", "and", "abb"};
        Set<String> set= new HashSet<>();
        List<String> duplicateStringList = Arrays.stream(arr).filter(i -> !set.add(i)).collect(Collectors.toList());

        System.out.println(duplicateStringList);
    }

}
