package com.hsbc.demo.playgame;

import org.junit.Ignore;
import org.junit.Test;


public class FunnyGameTest{

	@Test
	@Ignore
	public void testLaunchGameR1() {
		FunnyGame game = new FunnyGame(33, FunnyGame.RULE_FIR);
		game.launchGame();
	}
	
	@Test
	public void testLaunchGameR2() {
		FunnyGame game = new FunnyGame(33, FunnyGame.RULE_SED);
		game.launchGame();
	}
}
