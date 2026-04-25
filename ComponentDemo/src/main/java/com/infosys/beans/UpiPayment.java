package com.infosys.beans;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("upiPayment")
//@Primary
public class UpiPayment implements  PaymentService {
    @Override
    public void makePayement() {
        System.out.println("Upi payment");
    }
}
