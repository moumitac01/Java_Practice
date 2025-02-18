package com.java.prac;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenceyOfEachCharinString {
    public static void main(String args[]){
        String s1="Hello World";
        String s=s1.replace(" ","");
        Map<Character, Integer> m2=new HashMap<>();
        Map<Character,Long> m1=s.chars().mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(m1);

        for(int i=0; i<s.length();i++) {
            m2.putIfAbsent(s.charAt(i), m2.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println(m2);
        }
    }

