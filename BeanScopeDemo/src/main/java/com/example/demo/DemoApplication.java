package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context =
				SpringApplication.run(DemoApplication.class, args);

				OrderService order = context.getBean(OrderService.class);

		//OrderService order2 = context.getBean("getOrder2", OrderService.class);


		//OrderService order3 = new OrderService();

		//System.out.println(order == order2);
	}
}