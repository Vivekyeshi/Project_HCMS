package com.vivek.service;

import java.util.List;

import com.vivek.entities.AppraisalForms;

public interface AppraisalFormsService {
	List<AppraisalForms> getAllAppraisalForms();

	void addAppraisalForms(AppraisalForms appraisalForm);

	void updateAppraisalForms(AppraisalForms appraisalForm);

	void deleteAppraisalForms(int appraisalFormId);

	AppraisalForms getAppraisalFormsById(int appraisalFormId);
}
