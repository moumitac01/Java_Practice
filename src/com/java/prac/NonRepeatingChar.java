package com.java.prac;

//Write a program to find first non-repeating character from a input string
//Ex:
//Input : { "array", "apple", "rat"}
//Output: y,a,r

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonRepeatingChar {
    public static void main(String args[]){
        String [] str={ "array", "apple", "rat"};
        for(String s: str){
            Map<Character, Long> m1= s.chars()
                    .mapToObj(c ->(char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            List<Character> list=s.chars().mapToObj(c -> (char)c)
                    .filter(c ->m1.get(c)==1).collect(Collectors.toList());
            System.out.println(list);

            Optional<Character> s2=s.chars().mapToObj(c -> (char)c).filter(c -> m1.get(c)==1).findFirst();
            System.out.print(s2);

        }
    }
}
