package com.qa.exceptions;

import java.util.Scanner;

import com.qa.lambdas.NumberValidator;

public class UserInput {

	private static Scanner scanner = new Scanner(System.in);

	public static Integer getInt(NumberValidator validator) {
		Integer i = null;
		do {
			try {
				i = Integer.parseInt(scanner.nextLine());
				if (!validator.validate(i)) {
					i = null;
					System.out.println("Please enter a valid number!");
				}

			} catch (NumberFormatException nfe) {
				System.out.println("ERROR - Please enter a number!");
			}
		} while (i == null);

		return i;
	}

	public static void close() {
		scanner.close();
	}

}