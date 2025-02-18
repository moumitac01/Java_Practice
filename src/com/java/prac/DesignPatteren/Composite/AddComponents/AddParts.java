package com.java.prac.DesignPatteren.Composite.AddComponents;

import com.java.prac.DesignPatteren.Composite.Components;
import java.util.ArrayList;
import java.util.List;


public class AddParts implements Components {
    String name;
    public AddParts(String name) {
        super();
        this.name=name;
    }

    List<Components> componentsList= new ArrayList<>();
    public void addComponent(Components comp) {
        componentsList.add(comp);
    }

    @Override
    public void show() {
        System.out.println("Parts Name: "+ name);
        for(Components c: componentsList){
        c.show();
        }
    }
}
