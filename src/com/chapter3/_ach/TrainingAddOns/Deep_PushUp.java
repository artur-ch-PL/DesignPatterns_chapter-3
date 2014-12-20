package com.chapter3._ach.TrainingAddOns;

import com.chapter3._ach.TrainingPlans.Training;

public class Deep_PushUp extends ExtraExcercise_Decorator {
	Training training;
	
	public Deep_PushUp(Training t){
		this.training = t;
	}
	
	@Override
	public String getDescription() {
		return ("- with extra excercies basing on deep push ups");
	}

	@Override
	public int energy_cost() {
		return 200 + training.energy_cost();
	}

}
