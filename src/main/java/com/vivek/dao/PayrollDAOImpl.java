package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Payroll;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PayrollDAOImpl implements PayrollDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Payroll> getAllPayroll() {
		return entityManager.unwrap(Session.class).createQuery("from Payroll",Payroll.class).getResultList();
	}

	@Override
	public void addPayroll(Payroll payroll) {
		entityManager.unwrap(Session.class).persist(payroll);
		
	}

	@Override
	public void updatePayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePayroll(int payrollId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payroll getPayrollById(int payrollId) {
		// TODO Auto-generated method stub
		return null;
	}

}
