package com.java.prac;


import java.util.*;


//17. Find out the numerology number for the given name as mentioned below:
//Each alphabet represented with one number as given :
//A,I,J,Q,Y - 1
//B,K,R-2
//C,G,L,S - 3
//D,M,T - 4
//E,H,N,X -5
//U,V,W-6
//O,Z-7
//F-P-8
//Ex. If input String is "S. KANAPATHY" then output should be 4.
//S. KANAPATHY ==> 3+2+1+5+1+8+1+4+5+1=31 (3+1) = 4
public class NumerologyOfString {
    public static void main(String args[]){
            int sum=0;
        Map<Integer, List<Character>> m1= new HashMap<>();
        m1.put(1,  Arrays.asList('A','I','J','Q','Y'));
        m1.put(2,Arrays.asList('B','K','R'));
        m1.put(3,Arrays.asList('C','G','L','S'));
        m1.put(4,Arrays.asList('D','M','T'));
        m1.put(5, Arrays.asList('E', 'H', 'N', 'X'));
        m1.put(6, Arrays.asList('U', 'V', 'W'));
        m1.put(7, Arrays.asList('O', 'Z'));
        m1.put(8, Arrays.asList('F', 'P'));

        m1.forEach((key, value) -> System.out.println(key + " = " + value));

        String s="Hello World";

        for(char c: s.toUpperCase().replaceAll(" ","").toCharArray()){
            for(Map.Entry<Integer, List<Character>>entry: m1.entrySet()){
                if(entry.getValue().contains(c)){
                    sum=sum+ entry.getKey();
                }

            }
        }
        System.out.println(sum);
        int totalsum=sum%10+sum/10;
        System.out.println(totalsum);

    }
}
