package com.chapter3._ach.TrainingPlans;

public class UpperBodyPart_Training extends Training {

	public UpperBodyPart_Training() {
		description = "Upper Body Part Training";
	}
	
	@Override
	public int energy_cost() {
		return 1000;
	}
	
}
