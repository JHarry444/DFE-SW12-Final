package com.qa.enums.rps;

import java.util.Random;

public class RPSGame {

	private Random rand = new Random();

	public Result play(RPS player) {
		if (player == null)
			return null;
		int num = rand.nextInt(RPS.values().length); // 0, 1, 2

		RPS cpu = RPS.values()[num];

//		int num = rand.nextInt(3); // 0, 1, 2
//
//		RPS cpu = null;
//		if (num == 0)
//			cpu = RPS.ROCK;
//		else if (num == 1)
//			cpu = RPS.SCISSORS;
//		else
//			cpu = RPS.PAPER;

		System.out.println("CPU: " + cpu);

		return player.beats(cpu);

	}
}
