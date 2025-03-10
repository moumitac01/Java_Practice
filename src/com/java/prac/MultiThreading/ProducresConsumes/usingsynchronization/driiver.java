package com.java.prac.MultiThreading.ProducresConsumes.usingsynchronization;

public class driiver {
    public static void main(String args[]){
        proscons pr= new proscons("Pro");
        proscons con= new proscons("Con");
        pr.start();
        con.start();
    }

}
