package com.infosys.beans;


import org.springframework.stereotype.Component;

@Component("cardPayment")
public class CardPayment implements  PaymentService{
    @Override
    public void makePayement() {
        System.out.println("Card payment");
    }
}
