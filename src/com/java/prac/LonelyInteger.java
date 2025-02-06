package com.java.prac;

import java.util.*;

public class LonelyInteger {
    public static void main(String args[]){
        List<Integer> a= new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
        int lonelyint=0;
        Map<Integer, Integer> m1= new HashMap<>();
        for(int i: a){
            m1.put(i,m1.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: m1.entrySet()){
           if( entry.getValue()==1)
               lonelyint=entry.getKey();
        }
        System.out.println(lonelyint);
    }
}
