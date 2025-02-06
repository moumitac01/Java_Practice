package com.java.prac;

import java.util.*;
import java.util.stream.Collectors;

public class PrintOnlySingleOccurencenumber {
    //Using stream
    public void UsingStream(List<Integer> dupnumlist) {
        List<Integer> nodupnumlist = dupnumlist.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("After Removing Duplicates "+nodupnumlist);
    }
    //Using Map
    public void UsingMap (List<Integer>dupnumlist){
        List<Integer> nodupnumlist= new ArrayList<>();
        Map<Integer,Integer> nummap= new HashMap<>();
        for (int i:dupnumlist){
            nummap.put(i,nummap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry: nummap.entrySet()){
            if (entry.getValue()==1){
                nodupnumlist.add(entry.getKey());
            }
        }
        System.out.println("After Removing Duplicates using Map "+nodupnumlist);
    }

    public static void main(String args[]){
        List<Integer> dupNumList= Arrays.asList(2,0,2,5);
        PrintOnlySingleOccurencenumber printOnlySingleOccurencenumber= new PrintOnlySingleOccurencenumber();
        printOnlySingleOccurencenumber.UsingMap(dupNumList);
        printOnlySingleOccurencenumber.UsingStream(dupNumList);
    }

}
