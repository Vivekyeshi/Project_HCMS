package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.ApplicationStatus;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ApplicationStatusDAOImpl implements ApplicationStatusDAO{

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<ApplicationStatus> getAllApplicationStatus() {
		return entityManager.unwrap(Session.class).createQuery("from ApplicationStatus",ApplicationStatus.class).getResultList();
	}

	@Override
	public void addApplicationStatus(ApplicationStatus applicationStatus) {
		entityManager.unwrap(Session.class).persist(applicationStatus);
	}

	@Override
	public void updateApplicationStatus(ApplicationStatus applicationStatus) {
		entityManager.unwrap(Session.class).merge(applicationStatus);
		
	}

	@Override
	public void deleteApplicationStatus(ApplicationStatus applicationStatus) {
		entityManager.unwrap(Session.class).remove(applicationStatus);
		
	}

	@Override
	public ApplicationStatus getApplicationStatusById(int applicationId) {
		return entityManager.unwrap(Session.class).get(ApplicationStatus.class,applicationId);
	}


}
