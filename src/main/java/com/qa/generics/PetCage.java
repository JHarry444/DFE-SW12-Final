package com.qa.generics;

import com.qa.maps.Pet;

public class PetCage {

	private Pet pet;

	public PetCage(Pet p) {
		super();
		this.pet = p;
	}

	public Pet getPet() {
		return this.pet;
	}

	public void setP(Pet p) {
		this.pet = p;
	}

}
