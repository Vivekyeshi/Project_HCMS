package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.EducationDetailsDAOImpl;
import com.vivek.entities.EducationDetails;

@Service
public class EducationDetailsServiceImpl implements EducationDetailsService{

	@Autowired
	private EducationDetailsDAOImpl educationDetailsDAO;
	@Override
	public List<EducationDetails> getAllEducationDetails() {
		return educationDetailsDAO.getAllEducationDetails();
	}

	@Override
	public void addEducationDetail(EducationDetails educationDetail) {
		educationDetailsDAO.addEducationDetail(educationDetail);
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
