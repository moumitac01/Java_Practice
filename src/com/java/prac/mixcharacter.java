package com.java.prac;
//A list has mix of String, Integer and Float objects.
// How to find which data type has a greater number of objects in the list?

import java.util.Arrays;
import java.util.List;

public class mixcharacter {
    public static void main(String args[]){
        List<Object> mixedList = Arrays.asList("Hello", 10, 20.5f, "World", 30, 50.5f, 40);
        int stringCount=0;
        int intCount=0;
        int floatCount=0;

        for(Object obj: mixedList){
            if(obj instanceof String ){
                stringCount++;
            }
            if(obj instanceof Integer){
                intCount++;
            }
            if(obj instanceof Float){
                floatCount++;
            }
        }
        System.out.println("String numbers "+stringCount+", Int numbers "+intCount+", Float numbers "+floatCount);
    }
}
