package com.java.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingInArray {
    //Input: words = ["mass","as","hero","superhero"]
    //Output: ["as","hero"]
    //Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
    //["hero","as"] is also a valid answer.
    public static void main(String args[]){
        List<String> words = Arrays.asList("mass","as","hero","superhero");
        List<String> matchedString =new ArrayList<>();
        for (int i=0;i<words.size(); i++){
            for(int j=0; j<words.size();j ++){
                if (i!=j && words.get(j).contains(words.get(i))){
                    if(!matchedString.contains(words.get(i)))
                        matchedString.add(words.get(i));
                    System.out.println("Found String "+words.get(i));

                }
            }
        }
    }
}
