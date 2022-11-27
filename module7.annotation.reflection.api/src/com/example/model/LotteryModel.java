package com.example.model;

import java.util.List;

public class LotteryModel {
	@RandomNumber(min = 1, max = 16, size = 8, sorted = true, unique = true)
	private List<Integer> numbers;

	public LotteryModel() {
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		System.err.println("LotteryModel::setNumbers");
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "LotteryModel [numbers=" + numbers + "]";
	}

}
