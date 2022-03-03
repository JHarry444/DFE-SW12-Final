package com.qa.lambdas;

@FunctionalInterface // not required
public interface NumberValidator {

	// technically public abstract boolean validate(Integer i);
	boolean validate(Integer i);

//	boolean validate(String s); can't have more than 1 method

	public default void print(Object o) {
		System.out.println(o);
	}

}
