package com.qa.generics;

import java.util.List;

import com.qa.maps.Dog;
import com.qa.maps.Pet;

public class App {

	public static void main(String[] args) {
		Dog rex = new Dog("Rex", "Alsation");
		PetCage kennel = new PetCage(rex);
//		kennel.setPet(new Spider("Spinny", false));
		Pet dog = kennel.getPet();
		if (dog instanceof Dog)
			((Dog) dog).bark(); // tells java that 'dog' is a Dog
		else
			System.out.println("Defo not a dog");

		Dog spot = new Dog("Spot", "Dalmation");
		GenericCage<Dog> betterKennel = new GenericCage<Dog>(spot);

//		betterKennel.setPet(new Spider("Spinny", false));

		Dog dog2 = betterKennel.getPet();

		dog2.bark();

		List<Integer> nums = List.of(1, 2, 3, 4, 5);

		List<String> words = List.of("Hello", "World!");

		for (String s : words) {
			if (s.endsWith("!"))
				System.out.println(s);
		}

		List<Dog> pets = List.of(rex, spot);

		for (Dog d : pets) {
			d.bark();
		}
	}

}
