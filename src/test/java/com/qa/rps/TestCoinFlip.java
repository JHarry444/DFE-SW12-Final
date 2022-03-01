package com.qa.rps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.enums.CoinFlip;
import com.qa.enums.CoinFlipper;
import com.qa.enums.UserInput;

@RunWith(MockitoJUnitRunner.class)
// runs junit with mockito plugin to enable the mock shenanigans
public class TestCoinFlip {

	@Mock // creates a fake Random object
	private Random rand;

	@Mock
	private UserInput input;

	@InjectMocks // creates a coin flipper with the fake Random
	private CoinFlipper flipper;

	@Test
	public void testEdgeScan() {
		Mockito.when(this.input.getInput()).thenReturn("EDGE");
		Mockito.when(this.rand.nextInt(101)).thenReturn(100);

		assertTrue(this.flipper.flipCoin());

	}

	@Test
	public void testEdge() {
		// forces my mock random to return 100 when I call .nextInt(101)
		Mockito.when(this.rand.nextInt(101)).thenReturn(100);

		// checks that the method returns true
		assertTrue(this.flipper.flipCoin(CoinFlip.EDGE));

		// checks that the mock was used
		Mockito.verify(this.rand, Mockito.times(1)).nextInt(101);
	}

	@Test
	public void testHeads() {
		Mockito.when(this.rand.nextInt(101)).thenReturn(49);

		assertEquals(true, this.flipper.flipCoin(CoinFlip.HEADS));

		Mockito.verify(this.rand, Mockito.times(1)).nextInt(101);
	}

	@Test
	public void testTails() {
		Mockito.when(this.rand.nextInt(101)).thenReturn(99);

		assertEquals(true, this.flipper.flipCoin(CoinFlip.TAILS));

		Mockito.verify(this.rand, Mockito.times(1)).nextInt(101);
	}

}
