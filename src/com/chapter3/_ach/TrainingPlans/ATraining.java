package com.chapter3._ach.TrainingPlans;

public abstract class ATraining {
	String description  = "Description of training session:";
	
	
	public String getDescription(){
		return description;
	}

	public abstract int recalculateEnergyCost();
}
