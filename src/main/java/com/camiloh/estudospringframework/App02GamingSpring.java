package com.camiloh.estudospringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.camiloh.estudospringframework.game.GamingConsole;

public class App02GamingSpring {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}
}
