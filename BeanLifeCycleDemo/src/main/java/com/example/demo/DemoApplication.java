package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(DemoApplication.class, args);

		// OrderService order = context.getBean(OrderService.class);
		// order.placeOrder();

		// UserService userService = context.getBean(UserService.class);
		// userService.setBeanName("userBean2");

		// CartService cart = context.getBean(CartService.class);
		// System.out.println(cart.getValue(1));

		// context.close();
	}
}