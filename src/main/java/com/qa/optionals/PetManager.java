package com.qa.optionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.qa.maps.Pet;

public class PetManager {

	private List<Pet> pets = new ArrayList<>();

	public Optional<Pet> findByName(String name) {
		for (Pet p : this.pets) {
			if (name.equalsIgnoreCase(p.getName()))
				return Optional.of(p);
		}
		return Optional.empty();
	}

	public void addPet(Pet p) {
		this.pets.add(p);
	}

	public void print() {
		System.out.println(this.pets);
	}

}
