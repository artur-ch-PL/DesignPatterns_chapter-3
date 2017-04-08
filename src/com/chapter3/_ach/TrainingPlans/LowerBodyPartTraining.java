package com.chapter3._ach.TrainingPlans;

public class LowerBodyPartTraining extends ATraining{

	public LowerBodyPartTraining() {
		description = "Lower Body Part Training";
	}
	
	@Override
	public int recalculateEnergyCost() {
		return 500;
	}

}
