package com.java.prac.streams;

import java.util.Comparator;
import java.util.stream.Collectors;
//Reverse a String
public class ReverseString {
    public static void main(String args[]){
        String s="Hello World";

        String reverseString =s.replace(" ","").chars().mapToObj(c ->String.valueOf((char) c)).sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        System.out.println(reverseString);

    }
}
