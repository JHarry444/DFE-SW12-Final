package com.qa.exceptions;

import java.util.Scanner;

public class UserInput {

	private static Scanner scanner = new Scanner(System.in);

	public static Integer getInt() {
		Integer i = null;
		do {
			try {

				i = Integer.parseInt(scanner.nextLine());
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
