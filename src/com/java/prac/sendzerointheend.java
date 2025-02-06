package com.java.prac;

public class sendzerointheend {
    public static void main(String args[]){
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int lastfoundzero=0;
        for(int i=0; i<arr.length; i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[lastfoundzero];
            arr[lastfoundzero]=temp;
            lastfoundzero++;
        }

        }
        for(int i: arr){
            System.out.println(i);
        }
    }

}
