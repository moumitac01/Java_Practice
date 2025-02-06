package com.java.prac;

public class TimeConversion {
    public static void main(String args[]){
        String s= "12:45:54PM";//"07:05:45PM";//"12:40:22AM";//"06:40:03AM";////
        String hr="";
        System.out.println(s.substring(s.length()-2,s.length()));

        if(s.substring(s.length()-2,s.length()).equals("PM") ){
            hr= String.valueOf((Integer.parseInt(s.substring(0,2))+12));
            System.out.println(hr);
            if(hr.equals("24")){
                hr="12";
            }
            String news=hr+s.substring(2,s.length()-2);
            System.out.println(news);
        }
        else{
            if(s.substring(0,2).equals("12")){
                hr="00";
            }
            else{
                hr= s.substring(0,2);
            }
            String news=hr+s.substring(2,s.length()-2);
            System.out.println(news);
        }
    }

}