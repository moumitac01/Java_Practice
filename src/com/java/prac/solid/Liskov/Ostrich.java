package com.java.prac.solid.Liskov;

public class Ostrich extends NonFlyingBird {

    @Override
    public void cantfly() {
        System.out.println("I am ostrich I cant Fly");
    }
}
