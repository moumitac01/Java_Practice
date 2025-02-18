package com.java.prac.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondnoonrepetative {

    public static void main(String args[]){
        String s="There is a magic";

        //Convert of a Map
        Map<Character, Long> charMap= s.chars()
                                       .mapToObj(c ->(char) c)
                                       .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        //Find the non repetative char using stream
        Optional<Character> secondChar=charMap.entrySet().stream()
                                     .filter(entry -> entry.getValue()==1)
                                      .map(entry ->entry.getKey()).skip(1).findFirst();
        if(secondChar.isPresent())
        System.out.println(secondChar.get());
    }
}
