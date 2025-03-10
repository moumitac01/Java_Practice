package com.java.prac;

//. Remove the duplicate words from the given Sentence.
//Ex:
//a) Input: Good day day bye bye
//output: Good day bye
//b) input: greet the day user greet good day
//output:greet the day user good

import java.util.*;

public class RemoveDuplicateWord {
    public static void main(String args[]){

        List<String> strList= new ArrayList<>();
        strList.add("Good day day bye bye");
        strList.add("greet the day user greet good day");
        Set<String> wordSet = Set.of();

       for(String input: strList){
           String[] words =input.split(" ");
           wordSet= new LinkedHashSet<>(Arrays.asList(words));
           System.out.println(wordSet);
       }
    }
}
