package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;

import com.vivek.entities.ApplicationStatus;

import jakarta.persistence.EntityManager;

public class ApplicationStatusDAOImpl implements ApplicationStatusDAO{

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteApplicationStatus(int applicationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ApplicationStatus getApplicationStatusById(int applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
