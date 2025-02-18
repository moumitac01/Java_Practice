package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Common Elements between two Array
public class CommonElementsbetweenTwoArrays {
    public static void main(String args[]){
        List<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> list2= new ArrayList<>(Arrays.asList(3,5,2,7,9));

        List<Integer> commonList= list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(commonList);
    }
}
