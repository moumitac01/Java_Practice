//package com.java.prac.streams;
//
//import java.util.*;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class FindSecondnoonrepetative {
//
//    public static void main(String args[]) {
//        String s = "There is a magic";
//        char[] charArray = s.toCharArray();
//
//        //Conbvert to a Map
//        Map<Character,Long> m1 =s.chars()
//                                    .mapToObj(c ->(char) c)
//                                     .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
//        //find the second non repetating
//        Character c1=m1.entrySet().stream().filter().map().skip(1).findFirst();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        // Count occurrences
//
//        Optional<Character> c1=charCountMap.entrySet().stream()
//                .filter(entry-> entry.getValue()==1)
//                .map(Map.Entry::getKey).skip(1).findFirst();
//
//    }
//}
