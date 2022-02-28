package com.qa.rps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.enums.rps.RPS;
import com.qa.enums.rps.RPSGame;
import com.qa.enums.rps.Result;

public class TestRPS {

	private RPSGame game = new RPSGame();

	@Test
	public void test() {
		assertEquals(Result.WIN, this.game.play(RPS.ROCK));
	}

}
