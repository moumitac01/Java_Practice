package com.java.prac;

import java.util.*;

public class FindKDiffernce {

    public static Map<Integer, List<Integer>>  findDifference(int [] arr, int k){
        int left=0;
        Map<Integer, List<Integer>> m1= new HashMap<>();
        while(left< arr.length) {
            for ( int right = 0; right < arr.length; right++) {
                if (!(left == right) && ((arr[left] - k == arr[right]) || (arr[left] + k == arr[right]))) {
                    if (m1.containsKey(arr[left])) {
                        m1.get(arr[left]).add(arr[right]);
                    } else {
                        List<Integer> arrList = new ArrayList<>();
                        arrList.add(arr[right]);
                        m1.put(arr[left], arrList);
                    }
                }
            }
            left++;
        }

        return m1;
    }

    public static Map<Integer, List<Integer>> findDifferenceSet(int[] arr, int k) {
        Map<Integer, List<Integer>> result = new HashMap<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num - k)) {
                result.computeIfAbsent(num - k, x -> new ArrayList<>()).add(num);
            }
            if (seen.contains(num + k)) {
                result.computeIfAbsent(num, x -> new ArrayList<>()).add(num + k);
            }
            seen.add(num);
        }
        return result;
    }


    public static void main(String args[]) {
        int arr[] = {3, 2, 1, 5, 4};
        int k = 2;
        Map<Integer, List<Integer>> m2 = findDifference(arr, k);
        System.out.println(m2);
        Map<Integer, List<Integer>> mset = findDifferenceSet(arr, k);
        System.out.println(mset);
    }
}
