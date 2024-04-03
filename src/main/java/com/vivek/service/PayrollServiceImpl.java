package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.PayrollDAOImpl;
import com.vivek.entities.Payroll;

@Service
public class PayrollServiceImpl implements PayrollService {

	@Autowired
	private PayrollDAOImpl payrollDAO;
	@Override
	public List<Payroll> getAllPayroll() {
		return payrollDAO.getAllPayroll();
	}

	@Override
	public void addPayroll(Payroll payroll) {
		payrollDAO.addPayroll(payroll);		
	}

	@Override
	public void updatePayroll(Payroll payroll) {
		payrollDAO.updatePayroll(payroll);		
	}

	@Override
	public void deletePayroll(Payroll payroll) {
		payrollDAO.deletePayroll(payroll);		
	}

	@Override
	public Payroll getPayrollById(int payrollId) {
		return payrollDAO.getPayrollById(payrollId);
	}

}
