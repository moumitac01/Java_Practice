package com.java.prac;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ques3 {

    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        List<Integer> al= new ArrayList<>();
        for(int i=0; i<arr.length-k+1;i++){
         Set<Integer> s= new HashSet<>();
         for(int j=i;j<i+k;j++){
             s.add(arr[j]);
         }
           al.add(s.size());
        }
        System.out.println(al);
    }
}
