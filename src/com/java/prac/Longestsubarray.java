
package com.java.prac;

import java.util.HashMap;
import java.util.Map;

public class Longestsubarray {

    public static int maxLen(int[] arr) {
        int subarraylength=0;
        int sum=0;
        Map<Integer, Integer>m1=new HashMap<>();

        m1.put(0,-1);
        for(int i=0; i<arr.length;i++){
            sum+=(arr[i]==0)?-1:1;
            if(m1.containsKey(sum)){
                int count=i- m1.get(sum);
                subarraylength=Math.max(subarraylength,count);
            }
            else{
                m1.put(sum,i);
            }
        }
    return subarraylength;
    }

    public static void main(String args[]) {
        int arr[] = {0 ,1 ,1 ,0 ,0 ,0 ,0, 1 ,0, 1, 1, 1, 0, 0, 1, 0 ,0, 0
                ,0 ,0 ,1 ,0 ,0};
        int count = maxLen(arr);
        System.out.println(count);  // Expected Output: 6
    }
}
