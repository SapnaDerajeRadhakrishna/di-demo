package org.maxwell.spring.didemo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hallo vom primären Begrüßungsdienst";
	}

}
