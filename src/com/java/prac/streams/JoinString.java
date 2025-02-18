package com.java.prac.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String args[]){
        List<String> list= new ArrayList<>(Arrays.asList("Hello","World","Why","me"));

        String s=list.stream().collect(Collectors.joining(" "));

        System.out.println(s);

    }
}
