package com.vivek.service;

import java.util.List;

import com.vivek.dao.ApplicationStatusDAOImpl;
import com.vivek.entities.ApplicationStatus;

public class ApplicationStatusServiceImpl implements ApplicationStatusService {

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
