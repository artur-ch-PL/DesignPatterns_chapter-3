package com.chapter3._ach.Main;

import com.chapter3._ach.TrainingAddOns.BarPushUp;
import com.chapter3._ach.TrainingAddOns.DeepCrunch;
import com.chapter3._ach.TrainingAddOns.DeepPushUp;
import com.chapter3._ach.TrainingPlans.ATraining;
import com.chapter3._ach.TrainingPlans.LowerBodyPartTraining;
import com.chapter3._ach.TrainingPlans.WholeBodyTraining;

public class Main{
	
	public static void main(String[] args) {
		ATraining training = new WholeBodyTraining();
		System.out.println(training.getDescription());
		
		training = new DeepCrunch(training);
		System.out.println(training.getDescription());
		
		training = new BarPushUp(training);
		System.out.println(training.getDescription());
		
		System.out.println("Total energy cost:\t" + training.recalculateEnergyCost() + " kcal.");
		
		training = new LowerBodyPartTraining();
		System.out.println(training.getDescription());
		
		training = new DeepPushUp(training);
		System.out.println(training.getDescription());
		
		
		System.out.println("Total energy cost:\t" + training.recalculateEnergyCost() + " kcal.");
		
	}
	
}
