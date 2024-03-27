package com.vivek.dao;

import java.util.List;

import com.vivek.entities.TrainingFeedback;

public interface TrainingFeedbackDAO {
	List<TrainingFeedback> getAllTrainingFeedback();

	void addTrainingFeedback(TrainingFeedback trainingFeedback);

	void updateTrainingFeedback(TrainingFeedback trainingFeedback);

	void deleteTrainingFeedback(int trainingFeedbackId);

	TrainingFeedback getTrainingFeedbackById(int trainingFeedbackId);
}
