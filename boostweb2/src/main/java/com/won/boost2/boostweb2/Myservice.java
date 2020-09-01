package com.won.boost2.boostweb2;

import org.springframework.stereotype.Service;

@Service
public class Myservice {

	private final CalculatorService calculatorService;

	public Myservice(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public int execute(int val1,int val2) {
		return calculatorService.plus(val1, val2)*2;
	}
}
