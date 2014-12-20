package com.chapter3._ach.Main;

import com.chapter3._ach.TrainingAddOns.Bar_PushUp;
import com.chapter3._ach.TrainingAddOns.Deep_Crunch;
import com.chapter3._ach.TrainingPlans.Training;
import com.chapter3._ach.TrainingPlans.WholeBody_Training;

public class Main{
	
	public static void main(String[] args) {
		Training custom_training = new WholeBody_Training();
		System.out.println(custom_training.getDescription());
		custom_training = new Deep_Crunch(custom_training);
		System.out.println(custom_training.getDescription());
		custom_training = new Bar_PushUp(custom_training);
		System.out.println(custom_training.getDescription());
		System.out.println("Total energy cost:\t" + custom_training.energy_cost() + " kcal.");
	}
	
}
