package com.java.prac.streams;

import java.util.Arrays;

public class LastElementArray {
    public static void main(String args[]){
        int [] arr= {1,2,3,4,5,6};
        int last= Arrays.stream(arr).boxed().skip(arr.length-1).findFirst().get();

        System.out.println(last);
    }

}
