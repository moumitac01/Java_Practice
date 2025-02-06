package com.java.prac;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String args[]){
        String s="Hello World";
        Map<Character, Integer> m1= new HashMap<>();

        for(char c: s.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);

        }
        for (Map.Entry<Character, Integer> entry: m1.entrySet()){
            if (entry.getValue()>1) {
                System.out.println(entry.getKey() + "" + entry.getValue());
            }
        }
    }


}
