package com.java.prac.lamda;

import java.util.function.BiFunction;

//Write the lambda expression which  accepts n1 and n2 and return n1/n2
public class lamda {
    public static void main(String args[]){
        BiFunction<Double,Double,Double> divide=(n1,n2)-> n1/n2;

        Double result=divide.apply(10.0,5.0);
        System.out.println(result);


    }
}
