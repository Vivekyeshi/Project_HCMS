package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.ApplicationStatusDAOImpl;
import com.vivek.entities.ApplicationStatus;

@Service
public class ApplicationStatusServiceImpl implements ApplicationStatusService {

	@Autowired
	private ApplicationStatusDAOImpl applicationStatusDAO;

	@Override
	public List<ApplicationStatus> getAllApplicationStatus() {
		// TODO Auto-generated method stub
		return applicationStatusDAO.getAllApplicationStatus();
	}

	@Override
	public void addApplicationStatus(ApplicationStatus applicationStatus) {
		applicationStatusDAO.addApplicationStatus(applicationStatus);
	}

	@Override
	public void updateApplicationStatus(ApplicationStatus applicationStatus) {
		applicationStatusDAO.updateApplicationStatus(applicationStatus);
		
	}

	@Override
	public void deleteApplicationStatus(ApplicationStatus applicationStatus) {
		applicationStatusDAO. deleteApplicationStatus(applicationStatus);
		
	}

	@Override
	public ApplicationStatus getApplicationStatusById(int applicationId) {
		return applicationStatusDAO.getApplicationStatusById(applicationId);
	}


}
