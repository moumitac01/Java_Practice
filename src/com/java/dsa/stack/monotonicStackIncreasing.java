package com.java.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class monotonicStackIncreasing {
    public static int[] monotonicIncreasing(int [] nums){
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i: nums){
            while(!stack.isEmpty() && stack.peekLast()>i){
                stack.pollLast();
            }
            stack.offerLast(i);
        }
        int [] result=new int[stack.size()];
        int index=stack.size()-1;
        for(Integer i: stack){
            result[index--]=i;
        }
    return result;
    }
    public static void main(String args[]){
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] result = monotonicIncreasing(nums);
        for(int i: result){
            System.out.println(i);
        }
    }
}
