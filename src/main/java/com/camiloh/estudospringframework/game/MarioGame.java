package com.camiloh.estudospringframework.game;

public class MarioGame implements GamingConsole {

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
