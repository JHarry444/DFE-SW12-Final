package com.qa.streams;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseSolution {

	public static void main(String[] args) {
		// 1)
		List<String> names = List.of("Michael", "Dean", "James", "Chris");

		names.stream().filter(name -> !name.equals("James")).forEach(name -> {
			System.out.println("Hello " + name);
		});

		names.forEach(name -> {
			if (!name.equals("James"))
				System.out.println("Henlo " + name);
			else
				System.out.println(name);
		});

		// 2)
		List<Integer> nums = List.of(3, 4, 7, 8, 12);

		Integer product = nums.stream().reduce((acc, next) -> acc * next).get();
		System.out.println("PROD: " + product);

		// 3)
		// Find the max value.
		Integer maximum = nums.stream().reduce(Math::max).get();
		System.out.println("MAX: " + maximum);
		// Find the min value.
		Integer minimum = nums.stream().reduce(Math::min).get();
		System.out.println("Min: " + minimum);
		// Remove the odd numbers.
		List<Integer> evens = nums.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("EVENS: " + evens);
		// Remove the even numbers.
		List<Integer> odds = nums.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println("ODDS: " + odds);
		// Find the sum of the list.
		Integer sum = nums.stream().reduce((acc, next) -> acc + next).get();
		System.out.println("SUM: " + sum);
		// Square every number in the list then remove the even numbers and then find
		// the min value.
		Double min = nums.stream().map(num -> Math.pow(num, 2)).reduce(Math::min).get();
		System.out.println("MIN: " + min);
	}

}
