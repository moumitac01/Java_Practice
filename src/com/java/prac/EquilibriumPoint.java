package com.java.prac;

public class EquilibriumPoint {
    public static int findequlibrimpoint(int arr[]){
        int totalsum=0, leftsum=0;
        for(int i:arr){
            totalsum+=i;
        }
        for(int i=0;i<arr.length;i++){
            int rightsum=totalsum-leftsum-arr[i];
            if(rightsum==leftsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
    public static  void main(String args[]){
        int arr[]={1,2,0,3};
        int point =findequlibrimpoint(arr);
        System.out.println(point);
    }
}
