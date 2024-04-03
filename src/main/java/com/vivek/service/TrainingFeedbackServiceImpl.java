package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.TrainingFeedbackDAOImpl;
import com.vivek.entities.TrainingFeedback;

@Service
public class TrainingFeedbackServiceImpl implements TrainingFeedbackService{

	@Autowired
	private TrainingFeedbackDAOImpl trainingFeedbackDAO;
	@Override
	public List<TrainingFeedback> getAllTrainingFeedback() {
		return trainingFeedbackDAO.getAllTrainingFeedback();
	}

	@Override
	public void addTrainingFeedback(TrainingFeedback trainingFeedback) {
		trainingFeedbackDAO.addTrainingFeedback(trainingFeedback);		
	}

	@Override
	public void updateTrainingFeedback(TrainingFeedback trainingFeedback) {
		trainingFeedbackDAO.updateTrainingFeedback(trainingFeedback);		
	}

	@Override
	public void deleteTrainingFeedback(TrainingFeedback trainingFeedback) {
		trainingFeedbackDAO.deleteTrainingFeedback(trainingFeedback);		
	}

	@Override
	public TrainingFeedback getTrainingFeedbackById(int trainingFeedbackId) {
		return trainingFeedbackDAO.getTrainingFeedbackById(trainingFeedbackId);
	}

}
