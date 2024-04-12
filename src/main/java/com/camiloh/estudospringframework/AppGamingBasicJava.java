package com.camiloh.estudospringframework;

import com.camiloh.estudospringframework.game.GameRunner;
import com.camiloh.estudospringframework.game.MarioGame;
import com.camiloh.estudospringframework.game.SuperContraGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		var marioGame = new MarioGame();
	 	var superContraGame = new SuperContraGame(); 
		var gameRunner = new GameRunner(marioGame);

		gameRunner.run();
		
		marioGame.down();
	}
}
