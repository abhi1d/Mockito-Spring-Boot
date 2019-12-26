package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoService implements IDemo {

	public String addDemo() {
		
		return "Hello World";
	}

}
