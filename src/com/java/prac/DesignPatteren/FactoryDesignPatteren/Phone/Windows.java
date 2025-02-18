package com.java.prac.DesignPatteren.FactoryDesignPatteren.Phone;

import com.java.prac.DesignPatteren.FactoryDesignPatteren.OS.OS;

public class Windows implements OS {

    @Override
    public void spec() {
        System.out.println("I am Windows" );
    }
}
