package com.qa.exceptions;

public class DivisionWithExceptions {

	public static void main(String[] args) {
		try {
			DivisionWithExceptions divider = new DivisionWithExceptions();

			try {
				System.out.println("Enter the first number: ");
				int a = UserInput.getInt();

				System.out.println("Enter the second number: ");
				int b = UserInput.getInt();

				System.out.println("The result is:");
				System.out.println(divider.divide(a, b));
			} catch (ArithmeticException ae) {
				System.out.println("Plz don't divide by zero");
			} catch (NumberTooBigException ntbe) {
				System.out.println("ERROR - Second number was bigger than first");
			} catch (Exception e) {
				System.out.println("ERROR: " + e.getMessage());
			}
		} finally {
			UserInput.close();
		}
	}

	public int divide(int a, int b) throws NumberTooBigException {
		if (b > a)
			throw new NumberTooBigException("B should be smaller than a");
		return a / b;
	}

}
