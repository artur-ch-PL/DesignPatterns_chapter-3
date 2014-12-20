package com.chapter3._ach.TrainingPlans;

public class WholeBody_Training extends Training {

	public WholeBody_Training() {
		description = "Whole Body Training";
	}
	
	@Override
	public int energy_cost() {
		return 1500;
	}

}
