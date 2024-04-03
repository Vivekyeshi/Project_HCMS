package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.CandidateProfilesDAOImpl;
import com.vivek.entities.CandidateProfiles;

@Service
public class CandidateProfilesServiceImpl implements CandidateProfilesService {

	@Autowired
	private CandidateProfilesDAOImpl candidateProfilesDAO;
	@Override
	public List<CandidateProfiles> getAllCandidateProfiles() {
		return candidateProfilesDAO.getAllCandidateProfiles();
	}

	@Override
	public void addCandidateProfile(CandidateProfiles candidateProfile) {

		candidateProfilesDAO.addCandidateProfile(candidateProfile);
	}

	@Override
	public void updateCandidateProfile(CandidateProfiles candidateProfile) {
		candidateProfilesDAO.updateCandidateProfile(candidateProfile);		
	}

	@Override
	public void deleteCandidateProfiles(CandidateProfiles candidateProfile) {
		candidateProfilesDAO.deleteCandidateProfiles(candidateProfile);
		
	}

	@Override
	public CandidateProfiles getCandidateProfilesById(int candidateProfileId) {
		return candidateProfilesDAO.getCandidateProfilesById(candidateProfileId);
	}

}
