package com.java.prac;

import java.util.*;

public class Anagrams {
    public static List<List<String>> findAnagrams(String [] arr){
        Map<String,List<String>> m1= new HashMap<>();
       List<List<String>> anagramsList= new ArrayList<>();
       for(String s: arr){
           char[] c=s.toCharArray();
           Arrays.sort(c);
           String sortedString= new String(c);
           m1.putIfAbsent(sortedString, new ArrayList<>());
           m1.get(sortedString).add(s);
       }
       for(Map.Entry<String, List<String>> entry: m1.entrySet()){
           anagramsList.add(entry.getValue());
       }
        return anagramsList;
    }
    public static void main(String args[]){
        String arr[] = {"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
        List<List<String>> anagramsList= findAnagrams(arr);
        System.out.println(anagramsList);
    }
}
