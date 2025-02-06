package com.java.prac.solid.OpenorClosed;

//components must be open for extension, but, closed for modification.
public class ProcessOCP {

    public ProcessOCP(PaymentProcessor paymentProcessor, int i) {
        double ammount=paymentProcessor.ammount(i);
        System.out.println("Payment Type :" +paymentProcessor.getClass().getSimpleName() + " and ammount "+ammount);
    }

    public static void main(String args[]){
        //Process process =new Process();
        //PaymentProcessor creditCard =new CreditCard();
      new ProcessOCP(new CreditCard(),10);

        //PaymentProcessor upi=new UPI();
        new ProcessOCP(new UPI(),10);
    }
}
