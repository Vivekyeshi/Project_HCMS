package com.vivek.dao;

import java.util.List;

import com.vivek.entities.TrainingModules;

public interface TrainingModulesDAO {
	List<TrainingModules> getAllTrainingModules();

	void addTrainingModules(TrainingModules trainingModules);

	void updateTrainingModules(TrainingModules trainingModules);

	void deleteTrainingModules(int trainingModulesId);

	TrainingModules getTrainingModulesById(int trainingModulesId);
}
