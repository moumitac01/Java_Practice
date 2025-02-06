package com.java.prac;

//How to convert Map to List and how to get value for a given key from those lists?

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMaptoList {
    public static void main(String args[]){
        Map<Integer, String> m1=new HashMap<>();
        m1.put( 1,"a");
        m1.put( 2,"b");
        m1.put( 3,"c");
        m1.put( 4,"d");
        m1.put( 5,"e");
        int keyToFind = 4;
        List<Integer> keyList= new ArrayList<>();
        List<String> valueList= new ArrayList<>();

        for(Map.Entry<Integer,String> entry: m1.entrySet()){
            keyList.add(entry.getKey());
            valueList.add(entry.getValue());
        }

        int index=keyList.indexOf(keyToFind);
        System.out.println("Key "+keyToFind +" and Value is "+valueList.get(index));

    }

}
