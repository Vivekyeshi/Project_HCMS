package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.ExternalTrainers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ExternalTrainersDAOImpl implements ExternalTrainersDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<ExternalTrainers> getAllExternalTrainers() {
		return entityManager.unwrap(Session.class).createQuery("from ExternalTrainers",ExternalTrainers.class).getResultList();
	}

	@Override
	public void addExternalTrainers(ExternalTrainers externalTrainer) {
		entityManager.unwrap(Session.class).persist(externalTrainer);
		
	}

	@Override
	public void updateExternalTrainers(ExternalTrainers externalTrainer) {
		entityManager.unwrap(Session.class).merge(externalTrainer);		
	}

	@Override
	public void deleteExternalTrainers(ExternalTrainers externalTrainer) {
		entityManager.unwrap(Session.class).remove(externalTrainer);		
	}

	@Override
	public ExternalTrainers getExternalTrainersById(int externalTrainerId) {
		return entityManager.unwrap(Session.class).get(ExternalTrainers.class, externalTrainerId);
	}

}
