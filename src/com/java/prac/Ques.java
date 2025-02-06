package com.java.prac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ques {
    //String arr[] = { "abcd ",  "java",  "dcba",  "ajav",  "xyz",  "epam",  "pame",  "aepm" };
    //
    //O/p:
    //
    //[epam, pame, aepm] contains same character
    //
    //[java, ajav] contains same character
    //
    //[abcd, dcba] contains same character
   // String arr[] = { "abcd ",  "java",  "dcba",  "ajav",  "xyz",  "epam",  "pame",  "aepm" };
    public static void main(String args[]){
        Map<String, List<String>>m1= new HashMap<>();
        int count=0;
        String arr[] = { "abcd",  "java",  "dcba",  "ajav",  "xyz",  "epam",  "pame",  "aepm" };
        for(String s: arr){
            for (String s1:arr){
                        if(s.length()==s1.length() && !s.equals(s1)){
                            for(char c:s.toCharArray()) {
                                for (char c1 : s1.toCharArray()) {
                                    if (c1==c) {
                                        count++;
                                    }
                                }
                            }
                        }
                        if(count==s.length()){
                            m1.putIfAbsent(s,new ArrayList<>());
                            m1.get(s).add(s1);
                        }
                count=0;
            }
        }
       for(Map.Entry<String , List<String>> entry: m1.entrySet())
        System.out.println("{"+entry.getKey()+","+entry.getValue()+"}");
    }
}
