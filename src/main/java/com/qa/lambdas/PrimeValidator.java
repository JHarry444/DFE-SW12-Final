package com.qa.lambdas;

import java.util.ArrayList;
import java.util.List;

public class PrimeValidator implements Validator<Integer> {

	@Override
	public boolean validate(Integer num) {
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				factors.add(i);
		}
		return factors.size() < 3;
	}

}
