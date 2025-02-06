package com.java.prac.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Covert_Array_to_Streams {
	public static void main(String args[]) {
		//Premitive type Array
		int[]arrayInt= {1,2,3,4,5};
		IntStream intstream= Arrays.stream(arrayInt);
		intstream.forEach(System.out:: println);
		
		//Object type Array
		Integer[] Arrayobj = {1,4,5,6,7,8,9};
		Stream<Integer> objStream=Stream.of(Arrayobj);
		objStream.forEach(System.out::println);
	}

}
