package com.chapter3._ach.TrainingAddOns;

import com.chapter3._ach.TrainingPlans.ATraining;

public class DeepPushUp extends ExtraExcerciseDecorator {
	ATraining training;
	
	public DeepPushUp(ATraining t){
		this.training = t;
	}
	
	@Override
	public String getDescription() {
		return ("- with extra excercies basing on deep push ups");
	}

	@Override
	public int recalculateEnergyCost() {
		return 200 + training.recalculateEnergyCost();
	}

}
