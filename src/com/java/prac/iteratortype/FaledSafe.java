package com.java.prac.iteratortype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FaledSafe {
    public static void main(String args[]){
        List<Integer> list= new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Map<Integer,String > m1= new ConcurrentHashMap<>();
        m1.put(1,"a");
        m1.put(2,"b");
        m1.put(3,"c");


        for(int i: list){
            System.out.println(i);
            if(i==4){
                list.remove(4);
            }
        }
        for(Map.Entry<Integer, String > entry: m1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getKey()==3){
                m1.remove(3);
            }
        }
    }

}
