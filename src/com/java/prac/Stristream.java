package com.java.prac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stristream {


    public static void main(String args[]){
        String s ="Hello World";
        String news=s.replace(" ","");

        Map<Character ,Long> m1= news.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()));
        for( Map.Entry< Character, Long> entry: m1.entrySet()){
          System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

}
