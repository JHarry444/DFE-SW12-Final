package com.qa.generics;

import com.qa.maps.Pet;

public class PetCage {

	private Pet p;

	public PetCage(Pet p) {
		super();
		this.p = p;
	}

	public Pet getPet() {
		return this.p;
	}

	public void setPet(Pet p) {
		this.p = p;
	}

}
