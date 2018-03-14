package org.maxwell.spring.didemo.controller;

import org.maxwell.spring.didemo.services.GreetingService;

public class ConstructorInjectedController {

	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	String sayHello() {
		return greetingService.sayGreeting();
	}
}
