package com.vivek.service;

import java.util.List;

import com.vivek.entities.EmployeeManagers;

public interface EmployeeManagersService {
	List<EmployeeManagers> getAllEmployeeManagers();

	void addEmployeeManager(EmployeeManagers employeeManager);

	void updateEmployeeManager(EmployeeManagers employeeManager);

	void deleteEmployeeManagers(EmployeeManagers employeeManager);

	EmployeeManagers getEmployeeManagersById(int employeeManagerId);
}
