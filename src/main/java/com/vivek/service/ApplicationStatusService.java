package com.vivek.service;

import java.util.List;

import com.vivek.entities.ApplicationStatus;

public interface ApplicationStatusService {
	
	 List<ApplicationStatus> getAllApplicationStatus();
	
	 void addApplicationStatus(ApplicationStatus applicationStatus);
	
	void updateApplicationStatus(ApplicationStatus applicationStatus);

	void deleteApplicationStatus(int applicationId);
	
	ApplicationStatus getApplicationStatusById(int applicationId);
}
