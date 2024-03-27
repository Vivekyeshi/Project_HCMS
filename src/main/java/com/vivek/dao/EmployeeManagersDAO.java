package com.vivek.dao;

import java.util.List;

import com.vivek.entities.EmployeeManagers;

public interface EmployeeManagersDAO {
	List<EmployeeManagers> getAllEmployeeManagers();

	void addEmployeeManager(EmployeeManagers employeeManager);

	void updateEmployeeManager(EmployeeManagers employeeManager);

	void deleteEmployeeManagers(int employeeManagerId);

	EmployeeManagers getEmployeeManagersById(int employeeManagerId);
}
