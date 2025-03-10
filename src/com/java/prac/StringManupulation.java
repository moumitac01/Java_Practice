package com.java.prac;

//5. Write a program to print .
//A. all String which starts as "S" from the given String array
//B. Find out if String has all Unique Characters
//Ex:
//Input: {"apple","sample", "search","cat"}
//output: { "sample", "search"}

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringManupulation {
    public static boolean uniqueChar(String s){
        Set<Character> charSet= new HashSet<>();
        for(char c: s.toLowerCase().toCharArray()){
            if(!charSet.add(c)){
             return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String[] arr= {"apple","sample", "search","cat"};
        List<String> stringList= Arrays.stream(arr).filter(s -> s.startsWith("S") || s.startsWith("s")).toList();
        System.out.println(stringList);

        for(String s: stringList){
            boolean mark=uniqueChar(s);
            if(mark)
            System.out.println(s);
        }
    }
}
