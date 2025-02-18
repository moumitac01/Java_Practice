package com.java.prac.DesignPatteren.FactoryDesignPatteren;

import com.java.prac.DesignPatteren.FactoryDesignPatteren.OS.OS;
import com.java.prac.DesignPatteren.FactoryDesignPatteren.Phone.Andriod;
import com.java.prac.DesignPatteren.FactoryDesignPatteren.Phone.IOS;
import com.java.prac.DesignPatteren.FactoryDesignPatteren.Phone.Windows;

public class FactoryMain {
    public static void main(String args[]){
        OSFactory osFactory= new OSFactory();//calling Factory Method

        OS Andriodos= osFactory.getInstance("Andriod");
        Andriodos.spec();

        OS IOSos= osFactory.getInstance("IOS");
        IOSos.spec();

        OS WindoesOS= osFactory.getInstance("");
        WindoesOS.spec();
    }
}
