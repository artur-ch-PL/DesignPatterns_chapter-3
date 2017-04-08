package com.chapter3._ach.TrainingPlans;

public class WholeBodyTraining extends ATraining {

	public WholeBodyTraining() {
		description = "Whole Body Training";
	}
	
	@Override
	public int recalculateEnergyCost() {
		return 1500;
	}

}
