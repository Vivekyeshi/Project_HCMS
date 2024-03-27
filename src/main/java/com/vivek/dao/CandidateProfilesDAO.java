package com.vivek.dao;

import java.util.List;

import com.vivek.entities.CandidateProfiles;

public interface CandidateProfilesDAO {
	
	List<CandidateProfiles> getAllCandidateProfiles();

	void addCandidateProfile(CandidateProfiles candidateProfile);

	void updateCandidateProfile(CandidateProfiles candidateProfile);

	void deleteCandidateProfiles(int candidateProfileId);

	CandidateProfiles getCandidateProfilesById(int candidateProfileId);
}
