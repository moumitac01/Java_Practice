package com.java.prac.streams;

import java.util.ArrayList;
import java.util.List;

public class Fibonnacci {
    public static void finbonnaciusingfor(List<Integer> list,int n){
        {

            for(int i=0; i<n;i++){
                if(i==0){
                    list.add(0);
                }
                else if(i==1){
                    list.add(1);
                }
                else{
                    int j= list.get(i-1)+list.get(i-2);
                    list.add(j);
                }
            }
            System.out.println(list);
        }

    }

    public static int fibbonacirecursive(int n){
     if(n<=1){
         return n;
     }
     else{
        return  fibbonacirecursive(n-1)+fibbonacirecursive(n-2);
     }
    }
    public static void main(String args[]){
        List<Integer> list= new ArrayList<>();
        int n=10;
        finbonnaciusingfor(list, n);
        for(int i=0; i<n;i++)
        System.out.print(fibbonacirecursive(i)+ " ");
    }
}
