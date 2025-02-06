package com.java.prac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

public static void main(String args[]){
    int[] numbers= new int[5];
    for(int i=0;i<numbers.length;i++){
        numbers[i]=i*6;
    }
    int swap=0;
    //Sorting Array
    for(int i=0; i<numbers.length;i++){
        for(int j=i+1; j<numbers.length;j++){
            if(numbers[i]>numbers[j]){
                swap=numbers[j];
                numbers[j]=numbers[i];
                numbers[i]=swap;

            }
        }
    }
    for(int i=0; i<numbers.length;i++){

        System.out.println(numbers[i]);
    }
    System.out.println("Seconmd largest number using sort "+numbers[numbers.length-2]);
    List<Integer> squarenumbers= Arrays.stream(numbers).map(i -> i*i).boxed().collect(Collectors.toList());
    System.out.println("square Numbers "+squarenumbers);

    squarenumbers.sort((a,b)->b-a);
    System.out.println("Seconmd largest  square numbers using stream "+squarenumbers.get(1));

}



} 
