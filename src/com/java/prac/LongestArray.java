package com.java.prac;

import java.util.*;

public class LongestArray{
     public static int findLongestArray(int arr[], int k){
      int maxlength=0;
      int sum=0;
      Map<Integer,Integer> m1=new HashMap<>();
      m1.put(0,-1);
      for(int i=0; i<arr.length;i++){
          sum+=arr[i];
          if(m1.containsKey(sum-k)){
              int subarraylength=i-m1.get(sum-k);
              maxlength=Math.max(maxlength,subarraylength);
          }
          if(!m1.containsKey(sum)){
              m1.put(sum,i);
          }
      }
         return maxlength;
     }

    public static int findLongestArraywithfor(int arr[], int k){
         int sum=0;
         int maxlength=0;
         Map<Integer, List<Integer>> m1=new HashMap<>();
         for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
             if(sum==k){
                 maxlength= 1;
                 m1.put(1, Collections.singletonList(arr[i]));
             }

             for(int j=i+1; j<arr.length;j++){
                 sum=sum+arr[j];
                 if(sum==k){
                     maxlength= Math.max(maxlength,(j-i)+1);
                      List<Integer> l1=new ArrayList<>();
                       for(int p=i; p<=j;p++){
                           l1.add(arr[p]);
                       }
                       m1.put((j-i)+1, l1);
                 }
             }
             sum=0;
         }
         System.out.println(m1);

         return maxlength;

     }
    public static void main(String args[]){
       int arr[]={10,5,7,2,1,-10}; int k= 15;
      // int arr[]={23,90,62,91, 60, 82, -6, 18, 53, -42, 23, 90, 62, 91, 60, 82, -6, 18 ,53 ,-42};// int k= 60
        int maxlength=findLongestArray(arr,k);
        System.out.println(maxlength);

//        int maxlengthwithfor=findLongestArraywithfor(arr,k);
//        System.out.print(maxlengthwithfor);
    }
        }