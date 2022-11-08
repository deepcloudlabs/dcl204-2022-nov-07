package com.example.zoo;

import java.util.List;
import java.util.function.Consumer;

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
		// external loop
		/*
		for (var animal : zooAnimals) {
			animal.walk();
			animal.eat();
			if (animal instanceof Pet pet) {
				pet.play();
			}
		}
		*/
		// functional programming -> function
		// 1. HoF (Higher-Order Function)
		// 2. Pure Function -> SAM: 
		//    i) Lambda Expression
		//   ii)
		// since Java SE 8
		// Functional Interface -> Single Abstract Method (SAM)
		// Changes in interface
		// Stream API -> Filter/Map/Reduce
		                       // Lambda Expression -> Anonymous Class 
		int data =42; // effectivelly final 
		//data++;
		Consumer<Animal> walk= Animal::walk ;
		Consumer<Animal> eat= Animal::eat ;
		Consumer<Animal> playIfPet= animal -> {
			// int x = ++data;
			if (animal instanceof Pet pet) pet.play();
		} ;
		// 1. 1-liner
		// 2. Multi-core/Parallel Programming
		zooAnimals.stream()
		          .parallel()
		          .forEach(walk.andThen(eat).andThen(playIfPet));
	}

}
