package com.java.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate {
    public static <Characater> void main(String args[]){
        List<String> list= new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));

        List<String> distinctList=list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        String s="Programming";
        String s1=s.chars().distinct().mapToObj(c ->String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(s1);

        List<String> li= s.chars().distinct().mapToObj(c ->String.valueOf((char) c)).collect(Collectors.toList());
        System.out.println(li);
    }
}
