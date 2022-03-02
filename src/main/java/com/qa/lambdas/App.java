package com.qa.lambdas;

import java.util.ArrayList;
import java.util.List;

import com.qa.exceptions.UserInput;

public class App {

	public static void main(String[] args) {
		Function printOld = new FunctionImpl();
		printOld.func("Hello");

		Function printBusted = new Function() {

			@Override
			public void func(Object o) {
				System.out.println(o);

			}
		};
		printBusted.func("Never do this");

		Function printNew = o -> System.out.println(o);
		printNew.func("World!");

		NumberValidator isPositive = i -> i > 0;
		System.out.println("Please enter a positive number: ");
		int pos = UserInput.getInt(isPositive);

		NumberValidator isPrime = num -> {
			List<Integer> factors = new ArrayList<>();
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					factors.add(i);
			}
			return factors.size() < 3;
		};

		System.out.println("Please enter a prime number: ");
		int prime = UserInput.getInt(isPrime);

		NumberValidator isEvenOld = new NumberValidator() {

			@Override
			public boolean validate(Integer i) {
				return i % 2 == 0;
			}
		};

		NumberValidator isEvenNew = (i) -> {
			return i % 2 == 0;
		};

		NumberValidator isEvenNewOneLine = (i) -> i % 2 == 0;
		NumberValidator isEvenNewOneParameter = i -> i % 2 == 0;
	}

}
