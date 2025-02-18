package com.java.prac.Netcracker;

import java.util.HashMap;
import java.util.Map;

public class EmpMap {
    public static void main(String args[]){
        Map<Emp, String> m1= new HashMap<>();

        Emp e1= new Emp("1", "j", "Sales");
        Emp e2= new Emp("2", "k", "IT");
        m1.put(e1, "Excellent");
        m1.put(e2, "Good");

        e1.setDepartment("Marketing");

        System.out.println(" 1st " +m1.get(e1));
        System.out.println(" 2nd " +m1.containsKey(e1));
        System.out.println(" 3rd " +m1);

    }
}

