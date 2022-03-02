package com.qa.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Map<Person, List<Pet>> petMap = new HashMap<>();

		Person jh = new Person("Jordan", 27, "Trainer");

		petMap.put(jh, new ArrayList<>(List.of(new Dog("Rex", "Alsation"), new Spider("Spinny", false))));

		Person cy = new Person("Chris", 24, "Trainer");

		petMap.put(cy, List.of(new Dog("Woofie", "Chihuahua"), new Dog("Spot", "Dalmation")));

		System.out.println(petMap.get(jh));
		System.out.println(petMap.get(cy));

		List<Pet> jhPets = petMap.get(jh);
		jhPets.add(new Dog("Pooch", "Labrador"));
		jhPets.add(new Dog("Fido", "Beagle"));

		Set<Person> keySet = petMap.keySet();
		System.out.println("KEYS: " + keySet);
		for (Person key : petMap.keySet()) {
			System.out.println("KEY: " + key);
			System.out.println("VAL: " + petMap.get(key));
		}

		System.out.println("ENTRIES: " + petMap.entrySet());
		for (Entry<Person, List<Pet>> entry : petMap.entrySet()) {
			System.out.println("KEY: " + entry.getKey());
			System.out.println("VAL: " + entry.getValue());
		}

		Set<Person> people = new HashSet<>();
		people.add(cy);
		people.add(jh);
		people.add(cy);
		people.add(jh);
		people.add(new Person("Chris", 24, "Trainer"));
		people.add(new Person("Jordan", 27, "Trainer"));

		System.out.println("PEOPLE: " + people);

		System.out.println("CY pets: " + petMap.get(new Person("Chris", 24, "Trainer")));

		petMap.put(jh, new ArrayList<>());

		System.out.println(petMap.entrySet());
	}

}
