package com.camiloh.estudospringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {

	public void up() {
		System.out.println("Subindo");
	}

	public void down() {
		System.out.println("Descendo");
	}

	public void left() {
		System.out.println("Voltando");
	}

	public void right() {
		System.out.println("Seguindo");

	}
}
