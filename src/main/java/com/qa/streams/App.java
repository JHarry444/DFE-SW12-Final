package com.qa.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1_000, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		nums.forEach(num -> System.out.println(num));
		nums.forEach(System.out::println);
		for (Integer num : nums)
			System.out.println(num);

		Stream<Integer> numStream = nums.stream();
		Predicate<Integer> isPrime = (num) -> {
			if (num < 2)
				return false;
			List<Integer> factors = new ArrayList<>();
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					factors.add(i);
			}
			return factors.size() < 3;
		};
		numStream.filter(isPrime).forEach(System.out::println);

		List<Integer> primes = nums.stream().filter(isPrime).collect(Collectors.toList());
		System.out.println(primes);

		nums.stream().map(num -> num * 5).forEach(System.out::println);

		System.out.println(nums.stream().reduce((acc, next) -> {
			System.out.println("ACCUMULATOR: " + acc);
			System.out.println("NEXT: " + next);
			int result = acc * next;
			System.out.println("RESULT: " + result);
			return result;
		}).get());

	}

}
