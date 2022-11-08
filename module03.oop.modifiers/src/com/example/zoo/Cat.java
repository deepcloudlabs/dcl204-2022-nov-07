package com.example.zoo;

public class Cat extends Animal implements Pet {

	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public Cat() {
		this("Tekir");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("%s is playing now...".formatted(name));
	}

	@Override
	public void eat() {
		System.out.println("%s is eating now...".formatted(name));
	}

}
