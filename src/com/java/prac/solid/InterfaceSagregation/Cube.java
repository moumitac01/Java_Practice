package com.java.prac.solid.InterfaceSagregation;

public class Cube implements Volume{
    @Override
    public double calculatevol(int h, int w, int l) {
        return h*w*l;
    }
}
