package com.chapter3._ach.TrainingAddOns;

import com.chapter3._ach.TrainingPlans.ATraining;

public class BarPushUp extends ExtraExcerciseDecorator {
	ATraining training;
	
	public BarPushUp(ATraining training){
		this.training = training;		
	}
	
	@Override
	public String getDescription() {
		return ("- with extra excercies with Bar");
	}

	@Override
	public int recalculateEnergyCost() {
		return 250 + training.recalculateEnergyCost();
	}

}
