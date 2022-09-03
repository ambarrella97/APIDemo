package com.example.demo.entity;

public class Animal {
	
	private Long id;
	private String name;
	private String habitat;
	private int awesome;
	
	public Animal(Long id, String name, String habitat, int awesome) {
		super();
		this.id = id;
		this.name = name;
		this.habitat = habitat;
		this.awesome = awesome;
	}
	
	public Animal() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getAwesome() {
		return awesome;
	}
	public void setAwesome(int awesome) {
		this.awesome = awesome;
	}
	
}
