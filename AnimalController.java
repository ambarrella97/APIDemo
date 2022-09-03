package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Animal;
import com.example.demo.service.AnimalService;

@RestController
public class AnimalController {

	@Autowired
	AnimalService animalService;
	
	@GetMapping("/animal")
	public List<Animal> getAllAnimal() {
		return animalService.getAllAnimal();
	}
	
	@GetMapping("/animal/{id}")
	public Animal getAnimal(Long id) {
		return animalService.getAnimal(id);
	}
	
}
