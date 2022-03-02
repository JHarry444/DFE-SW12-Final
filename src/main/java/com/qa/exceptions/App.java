package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		exampleHandling();
		try {
			exampleThrows();
		} catch (ExampleCheckedException e) {
			System.out.println(e.getMessage());
		}

		exampleUnchecked();

		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("How old are you?");

			int age = scan.nextInt();

			System.out.println("You are " + age + " years old!");

		} catch (InputMismatchException ime) {
			System.out.println("Not A Number, muppet");
		} finally {
			scan.close();
			System.out.println("Closed your scanner for ya, guv");
		}

		NullPointerException npe = new NullPointerException();

		if (npe instanceof Exception) {
			System.out.println("B");
		} else if (npe instanceof NullPointerException) {
			System.out.println("A");
		}
		try {
			print("Hello");
//			print(null);
			print("Bonjour");

//		try {
//			main(null);
//		} catch (StackOverflowError e) {
//			System.out.println(e.getMessage());
//		}

			int i = 12 / 0;

			String s = null;
			System.out.println(s.length());

			int[] nums = { 1, 2, 3 };
			System.out.println(nums[12]);
		} catch (NullPointerException e) {
			System.out.println("Was null");
		} catch (ArithmeticException ae) {
			System.out.println("Don't try and divide by zero lol");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fin.");
		}
	}

	private static void exampleUnchecked() {
		throw new ExampleUncheckedException("SURPRISE");
	}

	private static void exampleHandling() {
		try {
			throw new ExampleCheckedException("Handled, init");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void exampleThrows() throws ExampleCheckedException { // heads up, this method throws a ___Exception
		throw new ExampleCheckedException("Not handled, innit");
	}

	private static void print(String s) {
		if (s == null)
			throw new NullPointerException("No string provided");
		System.out.println(s);
	}

}
