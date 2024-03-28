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
	public List<ExternalTrainers> getAllExtrnalTrainers() {
		return entityManager.unwrap(Session.class).createQuery("from ExternalTrainers",ExternalTrainers.class).getResultList();
	}

	@Override
	public void addextrnalTrainers(ExternalTrainers extrnalTrainer) {
		entityManager.unwrap(Session.class).persist(extrnalTrainer);
		
	}

	@Override
	public void updateextrnalTrainers(ExternalTrainers extrnalTrainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExtrnalTrainers(int extrnalTrainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExternalTrainers getExtrnalTrainersById(int extrnalTrainerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
