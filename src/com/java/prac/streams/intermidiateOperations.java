package com.java.prac.streams;

import java.util.*;
import java.util.stream.Collectors;

public class intermidiateOperations {
    public static void main(String args[]){
        List<List<String>> ListOfListString = new ArrayList<>(Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"),
                Arrays.asList("Reflection", "Collection", "Stream")
        ));

        Set<String> intermidiateResult= new HashSet<>();

        List<String> result=ListOfListString.stream().flatMap(List:: stream)
                .filter(s ->s.startsWith("S"))
                .map(String::toUpperCase)
                .peek(s->intermidiateResult.add(s))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Intermidiate Result");
        intermidiateResult.forEach(System.out::println);

        System.out.println("Final Result");
        result.forEach(System.out::println);
    }




}
