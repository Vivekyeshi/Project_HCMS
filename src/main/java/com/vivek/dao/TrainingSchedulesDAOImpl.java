package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.TrainingSchedules;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainingSchedulesDAOImpl implements TrainingSchedulesDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<TrainingSchedules> getAllTrainingSchedules() {
		return entityManager.unwrap(Session.class).createQuery("from TrainingSchedules",TrainingSchedules.class).getResultList();
	}

	@Override
	public void addTrainingSchedules(TrainingSchedules trainingSchedules) {
		entityManager.unwrap(Session.class).persist(trainingSchedules);
		
	}

	@Override
	public void updateTrainingSchedules(TrainingSchedules trainingSchedules) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainingSchedules(int trainingSchedulesId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TrainingSchedules getTrainingSchedulesById(int trainingSchedulesId) {
		// TODO Auto-generated method stub
		return null;
	}

}
