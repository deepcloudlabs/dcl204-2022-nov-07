package com.example.application;

import com.example.model.LotteryModel;
import com.example.service.RandomNumberGeneratorService;

public class LotteryApplication {

	public static void main(String[] args) throws Exception {
		var rngService = new RandomNumberGeneratorService();
		var lotteryModel = new LotteryModel();
		rngService.generate(lotteryModel);
		System.out.println(lotteryModel.getNumbers());
	}

}
