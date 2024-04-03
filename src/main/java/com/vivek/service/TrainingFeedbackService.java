package com.vivek.service;

import java.util.List;

import com.vivek.entities.TrainingFeedback;

public interface TrainingFeedbackService {
	List<TrainingFeedback> getAllTrainingFeedback();

	void addTrainingFeedback(TrainingFeedback trainingFeedback);

	void updateTrainingFeedback(TrainingFeedback trainingFeedback);

	void deleteTrainingFeedback(TrainingFeedback trainingFeedback);

	TrainingFeedback getTrainingFeedbackById(int trainingFeedbackId);
}
