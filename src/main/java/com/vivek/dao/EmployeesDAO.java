package com.vivek.dao;

import java.util.List;

import com.vivek.entities.Employees;

public interface EmployeesDAO {

	
	List<Employees> getAllEmployees();
	
	void addEmployee(Employees employee);
	
	void updateEmployee(Employees employee);
	
	void deleteEmployees(int employeeId);
	
	Employees getEmployeesById(int employeeId);
}
