package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(DemoApplication.class, args);

		OrderService order =
				context.getBean(OrderService.class);

		//System.out.println("Payment Service not started yet");

		order.placeOrder();

		//PaymentService paymentService =
		//		context.getBean(PaymentService.class);

	}

}