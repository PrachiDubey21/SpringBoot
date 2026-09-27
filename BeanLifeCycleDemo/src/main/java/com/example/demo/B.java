package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class B {

	A a;

	public void setA(A a) {
		this.a = a;
	}
}