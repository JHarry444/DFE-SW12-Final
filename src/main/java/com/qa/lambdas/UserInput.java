package com.qa.lambdas;

import java.util.Scanner;

public class UserInput {

	private static Scanner scanner = new Scanner(System.in);

	public static Integer getInt() {
		return getInt(null);
	}

	public static String getString() {
		return getString(null);
	}

	public static String getString(Validator<String> validator) {
		String s = null;
		do {
			s = scanner.nextLine();
			if (validator != null && !validator.validate(s)) {
				s = null;
				System.out.println("Please enter a valid string!");
			}

		} while (s == null);

		return s;
	}

	public static Integer getInt(Validator<Integer> validator) {
		Integer i = null;
		do {
			try {
				i = Integer.parseInt(getString());
				if (validator != null && !validator.validate(i)) {
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
