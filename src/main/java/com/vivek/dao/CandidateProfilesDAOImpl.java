package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.CandidateProfiles;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CandidateProfilesDAOImpl implements CandidateProfilesDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<CandidateProfiles> getAllCandidateProfiles() {
		return entityManager.unwrap(Session.class).createQuery("from CandidateProfiles",CandidateProfiles.class).getResultList();
	}

	@Override
	public void addCandidateProfile(CandidateProfiles candidateProfile) {
		entityManager.unwrap(Session.class).persist(candidateProfile);
		
	}

	@Override
	public void updateCandidateProfile(CandidateProfiles candidateProfile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCandidateProfiles(int candidateProfileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CandidateProfiles getCandidateProfilesById(int candidateProfileId) {
		// TODO Auto-generated method stub
		return null;
	}

}
