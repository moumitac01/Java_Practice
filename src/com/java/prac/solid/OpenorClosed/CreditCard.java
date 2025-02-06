package com.java.prac.solid.OpenorClosed;

public class CreditCard extends PaymentProcessor{

    @Override
    public double ammount(double ammount){
    ammount =ammount * ammount;
    return ammount;
    }

}
