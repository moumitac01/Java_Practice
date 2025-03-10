package com.java.prac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Panagram {
    public static boolean isPanagram(String sentence){
        Set<Character> CharSet= new HashSet<>();
        for(char c: sentence.toLowerCase().toCharArray()){
            if(c >='a' && c<='z')
            CharSet.add(c);
        }
        if(CharSet.size()==26) {
            return true;
        }
        else{
            return false;
        }
    }

    public static void findMissingChar(String sentence){
        Set<Character> allChar= new HashSet<>();
        Set<Character> strChar= new HashSet<>();

        for(char c='a'; c<='z'; c++){
            allChar.add(c);
        }

        for(char c:sentence.toLowerCase().toCharArray()){
            if(c>= 'a' && c<='z')
            strChar.add(c);
        }

        allChar.removeAll(strChar);
        System.out.println(allChar);
    }
    public static void main(String args[]){

        List<String> list= new ArrayList<>();
        list.add("The quick brown fox jumps over the lazy dog.");
        list.add("Hello World!");

        for(String s: list){
            if(isPanagram(s)){
                System.out.println("This is Panagram");
            }
            else{
                System.out.println("This is not a panagram");
                findMissingChar(s);
            }
        }


    }
}
