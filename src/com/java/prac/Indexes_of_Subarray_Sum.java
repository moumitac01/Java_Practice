package com.java.prac;

import java.util.ArrayList;
import java.util.List;

public class Indexes_of_Subarray_Sum {
    public static List<Integer> findsubarray(int arr[], int target){
        int sum=0; int left=0;
        List<Integer> subarray= new ArrayList<>();
        subarray.add(-1);
        for(int right=0; right<arr.length; right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                subarray.clear();
                subarray.add(left+1);
                subarray.add(right+1);
                return subarray;
            }
        }
        return subarray;
    }
    public static void main(String args[]){
    int arr[] = {1, 2, 3, 7, 5};
    int target = 12;
    List<Integer> subarray= findsubarray(arr,target);
    System.out.println(subarray);
    }
}
