package org.maxwell.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class DummyConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello from DummyConstructorGreetingService";
	}
}
