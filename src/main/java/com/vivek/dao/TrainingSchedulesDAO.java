package com.vivek.dao;

import java.util.List;

import com.vivek.entities.TrainingSchedules;

public interface TrainingSchedulesDAO {
	List<TrainingSchedules> getAllTrainingSchedules();

	void addTrainingSchedules(TrainingSchedules trainingSchedules);

	void updateTrainingSchedules(TrainingSchedules trainingSchedules);

	void deleteTrainingSchedules(TrainingSchedules trainingSchedules);

	TrainingSchedules getTrainingSchedulesById(int trainingSchedulesId);
}
