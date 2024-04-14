package com.camiloh.estudospringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWordSpring {
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloWordConfiguration.class);

		System.out.println(context.getBean("name"));

	}
}
