package com.qa.generics;

import java.util.ArrayList;
import java.util.List;

import com.qa.maps.Dog;
import com.qa.maps.Pet;
import com.qa.maps.Spider;

public class App {

	public static void main(String[] args) {

		List<Integer> nums = List.of(2, 4, 6, 8, 10);

		Integer i = nums.get(0);

		List<String> strings = List.of("A", "B", "C");
		String s = strings.get(0);

		List<?> list = new ArrayList<>(); // unusable list

		Cage<Dog> kennel = new Cage<>();
		kennel.setPet(new Dog("Rex", "Alsation"));
		Dog d = kennel.getPet();
		d.bark();
//		kennel.setPet(new Spider("Spinny", false));
		Cage<Spider> cage = new Cage<>();
		cage.setPet(new Spider("Spinny", false));
//		cage.setPet(new Dog("Rex", "Alsation"));
//		Cage<String> cg;

		PetCage kennel2 = new PetCage(new Dog("Spot", "Dalmation"));
		Pet p = kennel2.getPet();
		Dog d2 = (Dog) p; // cast pet -> dog
		d2.bark();
		// kennel2.setP(new Spider("Charlotte", false));
	}

}
