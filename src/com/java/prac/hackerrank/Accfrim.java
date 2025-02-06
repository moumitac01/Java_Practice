package com.java.prac.hackerrank;

public class Accfrim implements Company{
    int[] income;

    Accfrim(int n){
        income=new int[n];
        for(int i=0;i<n;i++){
            income[i]=0;
        }
    }

    @Override
    public void avgsal(){
        int sum=0;
        for(int i: income){
            sum=sum+i;
        }
        int avg=sum/income.length;
        System.out.println("AVG SALARY"+avg);
    }

    @Override
    public void maxsal(){
        int max=income[0];
        for(int i:income){
            if(i>max){
                max=i;
            }
        }
        System.out.println("MAX SALARY"+max);
    }

    @Override
    public void minsal() {
        int min =income[0];
        for(int i: income){
            if(i<min){
                min=i;
            }
        }
        System.out.println("Min Salary"+min);
    }

    @Override
    public void assignsal(int[] sal){
        int length=Math.min(sal.length,income.length);
        for(int i=0;i<length;i++){
            income[i]=sal[i];
        }
        System.out.println("Salary Credited");
    }
}
