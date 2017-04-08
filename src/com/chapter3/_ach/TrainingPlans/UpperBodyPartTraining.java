package com.chapter3._ach.TrainingPlans;

public class UpperBodyPartTraining extends ATraining {

	public UpperBodyPartTraining() {
		description = "Upper Body Part Training";
	}
	
	@Override
	public int recalculateEnergyCost() {
		return 1000;
	}
	
}
