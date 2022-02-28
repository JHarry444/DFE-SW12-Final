package com.qa.enums;

import java.util.Scanner;

public class UserInput {

	private Scanner scan = new Scanner(System.in);

	public String getInput() {
		return this.scan.nextLine();
	}
}
