package com.camiloh.estudospringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;

	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
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
