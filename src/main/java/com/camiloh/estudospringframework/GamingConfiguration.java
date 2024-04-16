package com.camiloh.estudospringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.camiloh.estudospringframework.game.GameRunner;
import com.camiloh.estudospringframework.game.GamingConsole;
import com.camiloh.estudospringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		return new PacManGame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
