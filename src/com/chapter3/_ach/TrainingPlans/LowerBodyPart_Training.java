package com.chapter3._ach.TrainingPlans;

public class LowerBodyPart_Training extends Training{

	public LowerBodyPart_Training() {
		description = "Lower Body Part Training";
	}
	
	@Override
	public int energy_cost() {
		return 500;
	}

}
