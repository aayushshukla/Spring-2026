package com.infosys.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    //@Qualifier("cardPayment") // specific bean name
    @Qualifier("upiPayment")  // qualifier works with autowired
    private  PaymentService paymentService;

    public  void processPayment()
    {
        paymentService.makePayement();
    }

}
