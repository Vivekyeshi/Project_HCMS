package com.vivek.service;

import java.util.List;

import com.vivek.entities.TrainingSchedules;

public interface TrainingSchedulesService {
	List<TrainingSchedules> getAllTrainingSchedules();

	void addTrainingSchedules(TrainingSchedules trainingSchedules);

	void updateTrainingSchedules(TrainingSchedules trainingSchedules);

	void deleteTrainingSchedules(TrainingSchedules trainingSchedules);

	TrainingSchedules getTrainingSchedulesById(int trainingSchedulesId);
}
