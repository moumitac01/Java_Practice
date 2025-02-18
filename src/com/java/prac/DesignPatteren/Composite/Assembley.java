package com.java.prac.DesignPatteren.Composite;

import com.java.prac.DesignPatteren.Composite.AddComponents.AddParts;
import com.java.prac.DesignPatteren.Composite.parts.Leaf;

public class Assembley {
    public static void main(String args[]){
    Leaf mouse = new Leaf("Mouse", 500);
    Leaf keyboard = new Leaf("Keyboard", 1000);
    Leaf monitor = new Leaf("Monitor", 9000);
    Leaf ram = new Leaf("RAM", 3000);
    Leaf rom = new Leaf("ROM", 3500);
    Leaf processor = new Leaf("Processor", 6000);
    Leaf cpu = new Leaf("CPU", 15000);

        AddParts memory= new AddParts("Memory");
        AddParts coreparts= new AddParts("CoreParts");
        AddParts asscesiores= new AddParts("Accessories");

        memory.addComponent(ram);
        memory.addComponent(rom);

        asscesiores.addComponent(monitor);
        asscesiores.addComponent(mouse);
        asscesiores.addComponent(keyboard);

        coreparts.addComponent(cpu);
        coreparts.addComponent(processor);
        coreparts.addComponent(memory);

        AddParts computer= new AddParts("Computer");
        computer.addComponent(coreparts);
        computer.addComponent(asscesiores);

       // computer.show();
        //coreparts.show();
        //asscesiores.show();
        memory.show();


    }
}
