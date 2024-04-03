package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Trainers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainersDAOImpl implements TrainersDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Trainers> getAllTrainers() {
		return entityManager.unwrap(Session.class).createQuery("from Trainers",Trainers.class).getResultList();
	}

	@Override
	public void addTrainer(Trainers trainer) {
		entityManager.unwrap(Session.class).persist(trainer);
		
	}

	@Override
	public void updateTrainer(Trainers trainer) {
		entityManager.unwrap(Session.class).merge(trainer);		
	}

	@Override
	public void deleteTrainers(Trainers trainer) {
		entityManager.unwrap(Session.class).remove(trainer);		
	}

	@Override
	public Trainers getTrainersById(int trainerId) {
		return entityManager.unwrap(Session.class).get(Trainers.class, trainerId);
	}

}
