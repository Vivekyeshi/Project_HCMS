package com.vivek.dao;

import java.util.List;

import com.vivek.entities.AppraisalForms;

public interface AppraisalFormsDAO {
	List<AppraisalForms> getAllAppraisalForms();

	void addAppraisalForms(AppraisalForms appraisalForm);

	void updateAppraisalForms(AppraisalForms appraisalForm);

	void deleteAppraisalForms(AppraisalForms appraisalForm);

	AppraisalForms getAppraisalFormsById(int appraisalFormId);
}
