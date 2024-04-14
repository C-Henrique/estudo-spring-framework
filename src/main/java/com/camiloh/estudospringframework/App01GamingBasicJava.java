package com.camiloh.estudospringframework;

import com.camiloh.estudospringframework.game.GameRunner;
import com.camiloh.estudospringframework.game.PacManGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
		//var game = new MarioGame();
	 	//var game = new SuperContraGame(); 
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);

		gameRunner.run();
		
	}
}
