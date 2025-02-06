package com.java.prac.solid.InterfaceSagregation;

//you should
// build small, focused interfaces
// that do not force the client to implement behavior they do not need.
public class Calculate {
    public static void main(String args[]){
        Square square =new Square();
        System.out.println("Area is "+square.calculatearea(10));

        Cube cube =new Cube();
        System.out.println("Volume is "+ cube.calculatevol(10,10,10));
    }
}
