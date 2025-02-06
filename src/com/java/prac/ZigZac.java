package com.java.prac;

import java.util.Arrays;

public class ZigZac {
    public static void main(String args[]){
        //int [] a= {1 ,2, 3, 4, 5, 6, 7};
        int [] a={2,3,5,1,4};
        int n =a.length;
        Arrays.sort(a);
        int mid = n /2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }

        for(int i: a){
            System.out.println(i);
        }
    }
}
