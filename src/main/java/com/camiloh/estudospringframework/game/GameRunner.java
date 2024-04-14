package com.camiloh.estudospringframework.game;

public class GameRunner {
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game : " + game);
		game.up();
		game.left();
		game.right();
		game.down();
	}
}
