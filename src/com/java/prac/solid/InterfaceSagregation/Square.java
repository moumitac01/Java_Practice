package com.java.prac.solid.InterfaceSagregation;

public class Square implements Area{

    @Override
    public double calculatearea(int l) {
        return l*l;
    }
}
