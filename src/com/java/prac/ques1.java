package com.java.prac;
//Input: str = "123123"
//Output: 6
//The complete string is of even length and sum of first and second
//half digits is same
//
//Input: str = "1538023"
//Output: 4
//The longest substring with same first and second half sum is "5380"
public class ques1 {
    public static void findlength(String s)
        {
            int[] arr= new int[s.length()];
            for(int i=0; i<s.length();i++){
                arr[i]=s.charAt(i) -'0';
            }
            for(int length=2;length<=arr.length;length+=2){
                for(int i=0;i<=(arr.length-length);i++){
                    int n=i+(length-1);
                    int [] q= new int[length];
                    int count=0;
                    for(int j=i;j<=n;j++){
                        // System.out.println(arr[j]);
                        q[count++]=arr[j];
                    }
                    for(int p:q){
                        //System.out.println(p);
                    }
                    int leftsum=0;
                    int rightsum=0;
                    for(int h=0;h<q.length/2;h++){
                        leftsum+=q[h];
                        rightsum+=q[q.length-1-h];
                    }
                    if(leftsum==rightsum)
                        System.out.println(length);
                }
            }
        }

    public static void main(String args[]){
        String s="1538023";
        findlength(s);
    }
}
