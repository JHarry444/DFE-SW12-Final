package com.qa.enums;

import java.time.LocalDate;
import java.time.Month;

public class App {

	public static void main(String[] args) {

		final int num = 27;
//		num = num + 1;
		final int[] nums = { 1, 2, 3, 4 };
		nums[0] = 27;
//		nums = new int[5];

		final Dog dog = new Dog("Rex", 12);
//		dog = new Dog("Woofie", 12);
		dog.setName("Woofie");

		System.out.println(Math.PI);
		// Month : 1 -> 12
		// int : -2.1b -> +2.1bn
		LocalDate d = LocalDate.of(1994, 4, 4);

		LocalDate ld = LocalDate.of(1994, Month.APRIL, 4);

		System.out.println(ld);

		CoinFlipper flipper = new CoinFlipper();
		for (int i = 0; i < 100; i++)
			System.out.println(flipper.flipCoin(CoinFlip.TAILS));
	}

}
