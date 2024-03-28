package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.AppraisalFormsDAOImpl;
import com.vivek.entities.AppraisalForms;

@Service
public class AppraisalFormsServiceImpl implements AppraisalFormsService{

	@Autowired
	private AppraisalFormsDAOImpl appraisalFormsDAO;
	@Override
	public List<AppraisalForms> getAllAppraisalForms() {

		return appraisalFormsDAO.getAllAppraisalForms();
	}

	@Override
	public void addAppraisalForms(AppraisalForms appraisalForm) {
		appraisalFormsDAO.addAppraisalForms(appraisalForm);
	}

	@Override
	public void updateAppraisalForms(AppraisalForms appraisalForm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAppraisalForms(int appraisalFormId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AppraisalForms getAppraisalFormsById(int appraisalFormId) {
		// TODO Auto-generated method stub
		return null;
	}

}
