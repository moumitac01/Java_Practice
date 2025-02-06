package com.java.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class diagonalDifference {
    //1 2 3
    //4 5 6
    //9 8 9
    public static int finddiff(List<List<Integer>> arr){
        int rightsum=0, leftsum=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0; j<arr.size();j++){
                if(i==j){
                    rightsum+=arr.get(i).get(j);
                }
            }
        }
        for(int i=0;i<arr.size(); i++){
            for(int j=arr.size()-1;j>=0;j--){
                if(i + j == arr.size() - 1){
                    leftsum+=arr.get(i).get(j);
                }
            }
        }
        System.out.println(rightsum-leftsum);
    return Math.abs(rightsum-leftsum);
    }
    public static int finddiffusingonefor(List<List<Integer>> arr) {

        int rightsum = 0, leftsum = 0;
        for (int i = 0; i < arr.size(); i++) {
            rightsum += arr.get(i).get(i);
            leftsum += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(leftsum - rightsum);
    }




    public static void main(String args[]){

        List<List<Integer>> arr = new ArrayList<>(Arrays.asList(
//                Arrays.asList(1,2,3),
//                Arrays.asList(4,5,6),
//                Arrays.asList(9,8,9)));
                Arrays.asList(6, 6, 7, -10, 9, -3, 8, 9, -1),
                Arrays.asList(9, 7, -10, 6, 4, 1, 6, 1, 1),
                Arrays.asList(-1, -2, 4, -6, 1, -4, -6, 3, 9),
                Arrays.asList(-8, 7, 6, -1, -6, -6, 6, -7, 2),
                Arrays.asList(-10, -4, 9, 1, -7, 8, -5, 3, -5),
                Arrays.asList(-8, -3, -4, 2, -3, 7, -5, 1, -5),
                Arrays.asList(-2, -7, -4, 8, 3, -1, 8, 2, 3),
                Arrays.asList(-3, 4, 6, -7, -7, -8, -3, 9, -6),
                Arrays.asList(-2, 0, 5, 4, 4, 4, -3, 3, 0)));
        int sum=finddiff(arr);
        int sumusingoneor=finddiffusingonefor(arr);
        System.out.println(sum+ " "+ sumusingoneor);
          }
}
