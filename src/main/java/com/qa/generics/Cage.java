package com.qa.generics;

import com.qa.maps.Pet;

public class Cage<T extends Pet> {

	private T pet;

	public T getPet() {
		return this.pet;
	}

	public void setPet(T pet) {
		this.pet = pet;
	}

}
