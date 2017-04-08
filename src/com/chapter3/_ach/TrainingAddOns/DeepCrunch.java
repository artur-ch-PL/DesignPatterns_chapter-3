package com.chapter3._ach.TrainingAddOns;

import com.chapter3._ach.TrainingPlans.ATraining;

public  class DeepCrunch extends ExtraExcerciseDecorator {
	ATraining training;
	
	public DeepCrunch(ATraining t) {
		this.training = t;
	}
	
	@Override
	public String getDescription() {
		return ("- with extra excercies basing on crunches");
	}

	@Override
	public int recalculateEnergyCost() {
		return 200 + training.recalculateEnergyCost();
	}
	
		
}
