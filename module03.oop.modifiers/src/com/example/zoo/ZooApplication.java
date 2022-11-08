package com.example.zoo;

import java.util.List;

public class ZooApplication {

	public static void main(String[] args) {
		var zooAnimals = List.of(
		   new Spider(),
		   new Cat("Garfield"),
		   new Fish("Free Willy"),
		   new Cat(),
		   new Spider(),
		   new Fish("Jaws")
		);
		for (var animal : zooAnimals) {
			animal.walk();
			animal.eat();
			if (animal instanceof Pet pet) {
				pet.play();
			}
		}
	}

}
