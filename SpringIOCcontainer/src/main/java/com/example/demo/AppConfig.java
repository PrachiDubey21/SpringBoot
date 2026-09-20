package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.payment.CardPayment;
import com.example.demo.payment.PaymentService;
import com.example.demo.payment.UPIpayment;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfig {

    @Bean
    public User createUser() {
        return new User("Prachi", 20);
    }

    @Bean
    @Qualifier("cp")
    public PaymentService createCardPayment() {
        return new CardPayment();
    }

    @Bean
    @Qualifier("upi")
    public PaymentService createUpiPayment() {
        return new UPIpayment();
    }

    @Bean
    public OrderService createOrderService(
            @Qualifier("cp") PaymentService paymentService) {

        return new OrderService(paymentService);
    }
}