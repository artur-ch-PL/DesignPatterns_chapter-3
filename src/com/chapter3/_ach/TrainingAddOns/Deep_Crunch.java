package com.chapter3._ach.TrainingAddOns;

import com.chapter3._ach.TrainingPlans.Training;

public  class Deep_Crunch extends ExtraExcercise_Decorator {
	Training training;
	
	public Deep_Crunch(Training t) {
		this.training = t;
	}
	
	@Override
	public String getDescription() {
		return ("- with extra excercies basing on crunches");
	}

	@Override
	public int energy_cost() {
		return 200 + training.energy_cost();
	}
	
		
}
