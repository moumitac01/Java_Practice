package com.java.dsa.stack;

public class ImmediateSmallerElement {
    public void immediateSmaller(int arr[]) {

        // code here
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                arr[i]=arr[i+1];
            }
            else{
                arr[i]=-1;
            }
        }
        arr[arr.length-1]=-1;
    }
    public static void main(String args[]){
        ImmediateSmallerElement immediateSmallerElement= new ImmediateSmallerElement();
        int arr[] = {4, 2, 1, 5, 3};
        immediateSmallerElement.immediateSmaller(arr);
        for(int i:arr) {
            System.out.println(i);
        }
    }
}
