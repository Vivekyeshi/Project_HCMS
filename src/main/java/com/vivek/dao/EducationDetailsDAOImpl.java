package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.EducationDetails;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EducationDetailsDAOImpl implements EducationDetailsDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<EducationDetails> getAllEducationDetails() {
		return entityManager.unwrap(Session.class).createQuery("from EducationDetails",EducationDetails.class).getResultList();
	}

	@Override
	public void addEducationDetail(EducationDetails educationDetail) {
		entityManager.unwrap(Session.class).persist(educationDetail);
		
	}

	@Override
	public void updateEducationDetail(EducationDetails educationDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEducationDetails(int educationDetailId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EducationDetails getEducationDetailsById(int educationDetailId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
