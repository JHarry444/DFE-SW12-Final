package com.qa.generics;

import com.qa.maps.Pet;

public class GenericCage<T extends Pet> {

	private T p;

	public GenericCage(T p) {
		super();
		this.p = p;
	}

	public T getPet() {
		return this.p;
	}

	public void setPet(T p) {
		this.p = p;
	}

}
