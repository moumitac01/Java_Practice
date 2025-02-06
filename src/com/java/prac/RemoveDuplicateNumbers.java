package com.java.prac;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateNumbers {

    //Using stream
    public void RemoveDuplicateNumbersUsingStream(List<Integer> dupnumlist) {
        List<Integer> nodupnumlist = dupnumlist.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("After Removing Duplicates "+nodupnumlist);
    }
    //Using Set
   public void RemoveDuplicateNumberssUsingSet(List<Integer> dupnumlist) {
       Set<Integer>integerSet= new HashSet<>(dupnumlist);
       List<Integer> noduplist = new ArrayList<>(integerSet);
       System.out.println("after removing duplicates by using Set "+noduplist);

   }

//Using Map
    public void RemoveDuplicateNumbersUsingMap (List<Integer>dupnumlist){
        List<Integer> nodupnumlist= new ArrayList<>();
        Map<Integer,Integer> nummap= new HashMap<>();
        for (int i:dupnumlist){
            nummap.put(i,nummap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry: nummap.entrySet()){
                nodupnumlist.add(entry.getKey());
        }
        System.out.println("After Removing Duplicates using Map "+nodupnumlist);
    }

    public static void main(String args[]) {
        List<Integer> dupnumlist= Arrays.asList(2,0,2,5);

        RemoveDuplicateNumbers removeDuplicateNumbersmap= new RemoveDuplicateNumbers();
        removeDuplicateNumbersmap.RemoveDuplicateNumbersUsingStream(dupnumlist);
        removeDuplicateNumbersmap.RemoveDuplicateNumberssUsingSet(dupnumlist);
        removeDuplicateNumbersmap.RemoveDuplicateNumbersUsingMap(dupnumlist);
   }
}
