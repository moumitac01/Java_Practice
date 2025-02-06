package com.java.prac.streams;

import java.util.ArrayList;
import java.util.List;

public class TraditionalVSStream {
	public static void main(String args[]) {
		List<Integer> num= new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		int sqsum=0;
		for(int n:num) {
			if(n%2==0) {
				int sq =n*n;
				sqsum +=sq;
			}
		}
		System.out.println("Traditional way"+ sqsum);
		
		int sqstream= num.stream().filter(n -> n%2==0).mapToInt(n -> n*n).sum();
		System.out.println("With Stream way"+ sqstream);
	}

}
