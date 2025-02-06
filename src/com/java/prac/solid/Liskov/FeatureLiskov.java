package com.java.prac.solid.Liskov;

//you must be able to replace a
// superclass object with a
// subclass object
// without affecting the correctness of the program.

//If we had only one abstarct class fly and extend it in
// two bird as Ostrich cant fly it will have dummy implementions
//which will violate Liskov
public class FeatureLiskov {
    public static void main(String args[]){
        FlyingBird egaleBird= new Egale();
        NonFlyingBird ostrichBird = new Ostrich();
        egaleBird.fly();
        ostrichBird.cantfly();
    }
}
