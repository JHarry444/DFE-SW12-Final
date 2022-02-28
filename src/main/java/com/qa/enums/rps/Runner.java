package com.qa.enums.rps;

public class Runner {

	public static void main(String[] args) {
		RPSGame rps = new RPSGame();
		for (int i = 0; i < 100; i++)
			System.out.println(rps.play(RPS.ROCK));

	}

}
