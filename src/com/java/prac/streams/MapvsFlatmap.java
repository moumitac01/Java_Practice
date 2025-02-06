package com.java.prac.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatmap {
	public static void main(String args[]) {
		
		//Map
		List<String> arraystring = Arrays.asList("Hello", "world"); 
		List<String> upperlist = arraystring.stream()
				.map(String::toUpperCase).collect(Collectors.toList());
		for(String s:upperlist) {
				System.out.println(s);			
		}
		
		//FlatMap
		List<List<Integer>>nesstedarray= Arrays.asList(
				Arrays.asList(2),
				Arrays.asList(3),
				Arrays.asList(4)
				);
		List<Integer> flatmapintarray =nesstedarray.stream()
				.flatMap(List::stream).map(n -> n*2)
				.collect(Collectors.toList());
		System.out.println("Before"+nesstedarray);
		System.out.println("After"+flatmapintarray);
		  
		
	}


}
