package com.vivek.service;

import java.util.List;

import com.vivek.entities.EducationDetails;

public interface EducationDetailsService {
	List<EducationDetails> getAllEducationDetails();

	void addEducationDetail(EducationDetails educationDetail);

	void updateEducationDetail(EducationDetails educationDetail);

	void deleteEducationDetails(int educationDetailId);

	EducationDetails getEducationDetailsById(int educationDetailId);
}
