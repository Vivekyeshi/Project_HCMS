package com.vivek.service;

import java.util.List;

import com.vivek.entities.Payroll;

public interface PayrollService {
	List<Payroll> getAllPayroll();

	void addPayroll(Payroll payroll);

	void updatePayroll(Payroll payroll);

	void deletePayroll(int payrollId);

	Payroll getPayrollById(int payrollId);
}
