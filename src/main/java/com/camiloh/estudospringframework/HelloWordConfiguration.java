package com.camiloh.estudospringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
}

record Address(String UF, String city) {
}

@Configuration
public class HelloWordConfiguration {

	@Bean
	public String name() {
		return "Ranga";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		return new Person("Ravi", 20);
	}

	@Bean
	public Address address() {
		return new Address("BR", "Fortaleza");
	}
}
