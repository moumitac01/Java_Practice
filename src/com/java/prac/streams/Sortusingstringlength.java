package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Sort according to String length
public class Sortusingstringlength {
    public static void main(String args[]){
        List<String> list= new ArrayList<>(Arrays.asList("hello", "World", "my","life","is","fucked"));

        List<String> lengthSortList= list.stream().sorted(Comparator.comparing(String:: length)).collect(Collectors.toList());
        System.out.println(lengthSortList);
    }
}
