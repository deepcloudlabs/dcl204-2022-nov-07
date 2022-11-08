package com.example.zoo;

public abstract class Animal {

	protected int legs;

	public Animal(int legs) {
		this.legs = legs;
	}

	public int getLegs() {
		return legs;
	}

	public abstract void eat();

	public void walk() {
		System.out.println("Animal with %d legs is walking now...".formatted(legs));
	}
}
