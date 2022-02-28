package com.qa.enums;

import java.util.Random;

public class CoinFlipper {

	private UserInput input = new UserInput();

	private Random rand = new Random();

	public boolean flipCoin() {
		System.out.println("Call Heads, Tails or Edge:");
		String option = this.input.getInput();
		CoinFlip call = CoinFlip.valueOf(option);

		return this.flipCoin(call);
	}

	public boolean flipCoin(CoinFlip call) {
		if (call == null)
			return false;

		int num = rand.nextInt(101); // 0 - 100
		CoinFlip actual = null;
		if (num < 50)
			actual = CoinFlip.HEADS;
		else if (num < 100)
			actual = CoinFlip.TAILS;
		else
			actual = CoinFlip.EDGE;
		System.out.println("ACTUAL: " + actual);

		return actual == call;
	}

}
