package com.java.prac.DesignPatteren.FactoryDesignPatteren;

import com.java.prac.DesignPatteren.FactoryDesignPatteren.OS.OS;
import com.java.prac.DesignPatteren.FactoryDesignPatteren.Phone.Andriod;
import com.java.prac.DesignPatteren.FactoryDesignPatteren.Phone.IOS;
import com.java.prac.DesignPatteren.FactoryDesignPatteren.Phone.Windows;

public class OSFactory {
    public OS getInstance(String str){
        if(str.equals("Andriod")){
            return new Andriod();
        }
        else if(str.equals("IOS")){
            return new IOS();
        }
        else
        return new Windows();
    }
}
