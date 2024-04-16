package com.camiloh.estudospringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Pulando");
	}

	public void down() {
		System.out.println("Agachando");
	}

	public void left() {
		System.out.println("Voltando");
	}

	public void right() {
		System.out.println("Seguindo");

	}

}
