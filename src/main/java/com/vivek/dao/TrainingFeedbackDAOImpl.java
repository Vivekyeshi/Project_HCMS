package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.TrainingFeedback;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainingFeedbackDAOImpl implements TrainingFeedbackDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<TrainingFeedback> getAllTrainingFeedback() {
		return entityManager.unwrap(Session.class).createQuery("from TrainingFeedback",TrainingFeedback.class).getResultList();
	}

	@Override
	public void addTrainingFeedback(TrainingFeedback trainingFeedback) {
		entityManager.unwrap(Session.class).persist(trainingFeedback);
		
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
