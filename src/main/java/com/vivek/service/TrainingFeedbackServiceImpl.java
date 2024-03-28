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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainingFeedback(int trainingFeedbackId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TrainingFeedback getTrainingFeedbackById(int trainingFeedbackId) {
		// TODO Auto-generated method stub
		return null;
	}

}
