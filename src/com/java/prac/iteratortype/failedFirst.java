package com.java.prac.iteratortype;

import java.util.*;

public class failedFirst {
    public static void failedFirstArrayList(List<Integer> list){
        {
            //Using for
            for(int i: list){
                System.out.println(i);
                if(i==4){
                    list.add(8);//will cause error
                }
            }

            Iterator<Integer> itr= list.iterator();

            while(itr.hasNext()){
                System.out.println(itr.next());
                list.set(4,5);//will not cause any error
                list.remove(7);//will cause error
                list.add(8);//will cause error
            }
        }
    }
    public static void failedFirstMap(Map<Integer, String> m1){

//        for (Map.Entry<Integer, String> entry : m1.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//                m1.remove(3);  // This will cause ConcurrentModificationException
//
//        }

        Iterator<Map.Entry<Integer, String>> itr =m1.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getKey()+" "+itr.next().getValue());
            m1.remove(3);// This will cause ConcurrentModificationException

        }

    }

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Map<Integer, String> m1= new HashMap<>();
        m1.put(1,"a");
        m1.put(2, "b");
        m1.put(3,"c");
       // failedFirstArrayList(list);
        failedFirstMap(m1);
    }

}
