package com.example.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.example.model.RandomNumber;

public class RandomNumberGeneratorService {
	public void generate(Object o) throws Exception {
		Class<?> clazz = o.getClass();
		for (var field : clazz.getDeclaredFields()) {
			if(field.isAnnotationPresent(RandomNumber.class)){
				RandomNumber randomNumber = field.getAnnotation(RandomNumber.class);
				var min = randomNumber.min();
				var max = randomNumber.max();
				var size = randomNumber.size();
				var stream = ThreadLocalRandom.current()
		                .ints(min,max);
				if (randomNumber.unique())
					stream = stream.distinct();
				stream = stream.limit(size);
		        if (randomNumber.sorted())
		        	stream = stream.sorted();
				var numbers = stream.boxed().toList();	
				var setterMethod = clazz.getDeclaredMethod("set%s%s".formatted(field.getName().substring(0, 1).toUpperCase(),field.getName().substring(1)),List.class);
				setterMethod.invoke(o,numbers);
//				field.setAccessible(true);
//				field.set(o, numbers);
//				field.setAccessible(false);
			}
		}
	}
}
