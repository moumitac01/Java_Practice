package com.java.prac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Count_distinct_elements_in_every_window {
    public static List<Integer> findcountofdistinctelementsineverywindoe(int arr[] ,int k ){
        List<Integer> al= new ArrayList<>();
        for(int i=0; i<arr.length-k+1;i++){
            Set<Integer> set= new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            al.add(set.size());
        }
    return al;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
       // int arr[]={8 ,10 ,6};
       // int k=1;
        List<Integer> al=findcountofdistinctelementsineverywindoe(arr, k);
        System.out.println(al);
    }


}
