package com.java.prac.functionalInterface;

import java.util.function.BiFunction;

public class FuntionalInterface {

	public static void main(String[] args) {
		//BiFunction
		BiFunction< Double, Double, Double> divide= (n1,n2)-> n1/n2;

		Double result= divide.apply(10.5,2.0);
		System.out.println(result);

	}

}
