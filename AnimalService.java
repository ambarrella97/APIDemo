package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Animal;

@Service
public class AnimalService {

	private List<Animal> animalList=new ArrayList<>(Arrays.asList(
			new Animal(1l, "whale", "ocean", 6),
			new Animal(2l, "owl", "forest", 8),
			new Animal(3l, "bear", "forest", 7),
			new Animal(4l, "coyote", "desert", 9),
			new Animal(5l, "lion", "savannah", 10)
			));

	public List<Animal> getAllAnimal() {
		return animalList;
	}

	public Animal getAnimal(Long id) {
		for(Animal animal: animalList) {
			if(animal.getId() == id) {
				return animal;
			}
		}
		return null;
	}
	
}
