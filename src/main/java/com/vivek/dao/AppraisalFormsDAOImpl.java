package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.AppraisalForms;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AppraisalFormsDAOImpl implements AppraisalFormsDAO{
	@Autowired
	private EntityManager entityManager;
	@Override
	public List<AppraisalForms> getAllAppraisalForms() {
		return entityManager.unwrap(Session.class).createQuery("from AppraisalForms",AppraisalForms.class).getResultList();
	}

	@Override
	public void addAppraisalForms(AppraisalForms appraisalForm) {
		entityManager.unwrap(Session.class).persist(appraisalForm);
		
	}

	@Override
	public void updateAppraisalForms(AppraisalForms appraisalForm) {
		entityManager.unwrap(Session.class).merge(appraisalForm);
	}

	@Override
	public void deleteAppraisalForms(AppraisalForms appraisalForm) {
		entityManager.unwrap(Session.class).remove(appraisalForm);
	}

	@Override
	public AppraisalForms getAppraisalFormsById(int appraisalFormId) {
		return entityManager.unwrap(Session.class).get(AppraisalForms.class, appraisalFormId);
	}

}
