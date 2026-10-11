package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

	private PaymentGateway paymentGateway;

	public DemoRunner(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	@Override
	public void run(String... args) throws Exception {

		paymentGateway.print();
	}

}
