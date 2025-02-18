package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
//find string starts with number or letter
public class FindStringStartswith {
    public static void main(String args[]){
        List<String> list = new ArrayList<>(Arrays.asList("Above", "and", "lamp","pop"));
        //Print string starts with A
        List<String> result= list.stream().filter(s -> s.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.print(result);
        //Print string starts with number
        List<String> list2= new ArrayList<>(Arrays.asList("123apple", "apple", "456banana", "pear", "7elephant"));
        List<String> result2 =list2.stream().filter(s -> s.matches("0-9")).collect(Collectors.toList());
        System.out.println(result2);
    }
}
