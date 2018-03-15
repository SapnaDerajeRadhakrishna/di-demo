package org.maxwell.spring.didemo.controller;

import org.maxwell.spring.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DummyConstructorInjectedController {
	private GreetingService greetingService;

	public DummyConstructorInjectedController(@Qualifier("dummyConstructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
