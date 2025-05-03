package com.java.prac.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String args[]){

        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );

        // forEach: Print each name
        names.stream().forEach(System.out::println);

        // collect: Collect names starting with 'S' into a list
        List<String> sList=names.stream().filter(s->s.startsWith("S"))
                                .collect(Collectors.toList());
        System.out.println("String starts with S");
        sList.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        String concanateString= names.stream().reduce("",(p,e)-> p+" "+e );
        System.out.println("Concaated String "+concanateString);

        // count: Count the number of names
        long count=names.stream().count();
        System.out.println("Count of names "+count);

        // findFirst: Find the first name
        Optional<String> findFirstname=names.stream().findFirst();
        findFirstname.ifPresent(System.out::println);

        // allMatch: Check if all names start with 'S'
        boolean allStartsWithS= names.stream().allMatch(n-> n.startsWith("S"));
        System.out.println("if any name starts with S "+allStartsWithS);

        // anyMatch: Check if any name starts with 'S'
        boolean anyMatchwithS= names.stream().anyMatch(n-> n.startsWith("S"));
        System.out.println("if any match with S "+anyMatchwithS);
    }
}
