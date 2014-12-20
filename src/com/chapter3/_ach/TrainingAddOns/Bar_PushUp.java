package com.chapter3._ach.TrainingAddOns;

import com.chapter3._ach.TrainingPlans.Training;

public class Bar_PushUp extends ExtraExcercise_Decorator {
	Training training;
	
	public Bar_PushUp(Training t){
		this.training = t;		
	}
	
	@Override
	public String getDescription() {
		return ("- with extra excercies with Bar");
	}

	@Override
	public int energy_cost() {
		return 250 + training.energy_cost();
	}

}
