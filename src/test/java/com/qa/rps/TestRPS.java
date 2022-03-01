package com.qa.rps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.enums.rps.RPS;
import com.qa.enums.rps.RPSGame;
import com.qa.enums.rps.Result;

@RunWith(MockitoJUnitRunner.class)
public class TestRPS {

	@Mock // creates a mock Random object
	private Random rand;

	@InjectMocks // creates an RPSGame with the mock Random object
	private RPSGame game;

	private final int bound = 3;

	private final int rock = 0;
	private final int paper = 1;
	private final int scissors = 2;

	@Test
	public void testRockWins() {
		Mockito.when(this.rand.nextInt(this.bound)).thenReturn(this.scissors); // forces num to be 2

		assertEquals(Result.WIN, this.game.play(RPS.ROCK));

		Mockito.verify(this.rand, Mockito.times(1)).nextInt(this.bound);
	}

	@Test
	public void testRockDraws() {
		Mockito.when(this.rand.nextInt(this.bound)).thenReturn(this.rock); // forces num to be 0

		assertEquals(Result.DRAW, this.game.play(RPS.ROCK));

		Mockito.verify(this.rand, Mockito.times(1)).nextInt(this.bound);
	}

	@Test
	public void testRockLoses() {
		Mockito.when(this.rand.nextInt(this.bound)).thenReturn(this.paper); // forces num to be 1

		assertEquals(Result.LOSE, this.game.play(RPS.ROCK));

		Mockito.verify(this.rand, Mockito.times(1)).nextInt(this.bound);
	}

	@Test
	public void testPaperLoses() {
		Mockito.when(this.rand.nextInt(this.bound)).thenReturn(this.scissors); // forces num to be 2

		assertEquals(Result.LOSE, this.game.play(RPS.PAPER));

		Mockito.verify(this.rand, Mockito.times(1)).nextInt(this.bound);
	}

	@Test
	public void testScissorsLoses() {
		Mockito.when(this.rand.nextInt(this.bound)).thenReturn(this.rock); // forces num to be 0

		assertEquals(Result.LOSE, this.game.play(RPS.SCISSORS));

		Mockito.verify(this.rand, Mockito.times(1)).nextInt(this.bound);
	}

	@Test
	public void testNull() {
		assertNull(this.game.play(null));
	}

}
