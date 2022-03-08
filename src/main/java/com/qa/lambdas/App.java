package com.qa.lambdas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App extends Object {

	public static void main(String[] args) {
//		Function printOld = new FunctionImpl();
//		printOld.func("Hello");
//
//		Function printBusted = new Function() {
//
//			@Override
//			public void func(Object o) {
//				System.out.println(o);
//
//			}
//		};
//		printBusted.func("Never do this");
//
//		Function printNew = o -> System.out.println(o);
//		printNew.func("World!");
//
//		NumberValidator isPositive = i -> i > 0;
//		System.out.println("Please enter a positive number: ");
//		int pos = UserInput.getInt(isPositive);
//
//		NumberValidator isPrime = num -> {
//			List<Integer> factors = new ArrayList<>();
//			for (int i = 1; i <= num; i++) {
//				if (num % i == 0)
//					factors.add(i);
//			}
//			return factors.size() < 3;
//		};
//
//		System.out.println("Please enter a prime number: ");
//		int prime = UserInput.getInt(isPrime);
//
//		NumberValidator isEvenOld = new NumberValidator() {
//
//			@Override
//			public boolean validate(Integer i) {
//				return i % 2 == 0;
//			}
//		};
//
//		NumberValidator isEvenNew = (i) -> {
//			return i % 2 == 0;
//		};
//
//		NumberValidator isEvenNewOneLine = (i) -> i % 2 == 0;
//		NumberValidator isEvenNewOneParameter = i -> i % 2 == 0;
//
//		int factor = 3;
//		NumberValidator isMultipleOf = i -> i % factor == 0;
//
//		Calculation addition = (a, b) -> a + b;
//		System.out.println(addition.calculate(12, 6));
//		Calculation subtraction = new Calculation() {
//			@Override
//			public double calculate(double a, double b) {
//				return a - b;
//			}
//		};
//		Calculation multiplication = (a, b) -> a * b;
//		Calculation division = (a, b) -> a / b;
//		System.out.println(division.calculate(12, 0));
//
//		Calculation powers = (a, b) -> Math.pow(a, b);
//		Calculation powersReference = Math::pow; // shortcut for previous line
//		Calculation powersOld = new Calculation() {
//			@Override
//			public double calculate(double a, double b) {
//				return Math.pow(a, b);
//			}
//		};
//		System.out.println(powers.calculate(3, 2));

		System.out.println("Please enter A, B, or C");

		Validator<String> stringValidator = s -> s.equalsIgnoreCase("A") || s.equalsIgnoreCase("B")
				|| s.equalsIgnoreCase("C");
		String input = UserInput.getString(stringValidator);
		System.out.println("You chose: " + input);

		PrimeValidator pv = new PrimeValidator();
		System.out.println(pv instanceof Validator);
		System.out.println(new ArrayList<>() instanceof List);
		System.out.println(new LinkedList<>() instanceof List);

	}

}
