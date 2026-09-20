package com.example.demo.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("up")
public class UPIpayment implements PaymentService {

    @Override
    public void pay() {
        System.out.println("Paying by UPI");
    }
}