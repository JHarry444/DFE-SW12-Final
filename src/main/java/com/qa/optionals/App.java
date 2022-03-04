package com.qa.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;

import com.qa.maps.Dog;
import com.qa.maps.Pet;

public class App {

	public static void main(String[] args) {
		PetManager manager = new PetManager();
		manager.addPet(new Dog("Rex", "Alsation"));

		manager.addPet(new Dog("Spot", "Dalmation"));

		manager.addPet(new Dog("Woofy", "Doberman"));

		manager.print();

		Optional<Pet> found = manager.findByName("Sp0t");
//		if (found != null)
//			System.out.println(found.toString());
//		else
//			System.out.println("No pet found with that name!");

//		System.out.println(found.get());
//		if (found != null)
//		System.out.println(found.toString());
//	else
//		System.out.println("No pet found with that name!");
		if (found.isPresent())
			System.out.println(found.get().toString());
		else
			System.out.println("No pet found with that name!");

//		found.ifPresentOrElse(p -> System.out.println(p), () -> System.out.println("No pet found with that name!"));

		Pet p = found.orElseThrow(() -> new NoSuchElementException("No pet found with name!"));
	}

}
