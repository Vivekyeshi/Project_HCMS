package com.vivek.service;

import java.util.List;

import com.vivek.entities.CandidateProfiles;

public interface CandidateProfilesService {
	
	List<CandidateProfiles> getAllCandidateProfiles();

	void addCandidateProfile(CandidateProfiles candidateProfile);

	void updateCandidateProfile(CandidateProfiles candidateProfile);

	void deleteCandidateProfiles(CandidateProfiles candidateProfile);

	CandidateProfiles getCandidateProfilesById(int candidateProfileId);
}
