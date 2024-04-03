package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.EmployeeManagersDAOImpl;
import com.vivek.entities.EmployeeManagers;

@Service
public class EmployeeManagersServiceImpl implements EmployeeManagersService {

	@Autowired
	private EmployeeManagersDAOImpl employeeManagersDAO;
	@Override
	public List<EmployeeManagers> getAllEmployeeManagers() {
		return employeeManagersDAO.getAllEmployeeManagers();
	}

	@Override
	public void addEmployeeManager(EmployeeManagers employeeManager) {
		employeeManagersDAO.addEmployeeManager(employeeManager);
	}

	@Override
	public void updateEmployeeManager(EmployeeManagers employeeManager) {
		employeeManagersDAO.updateEmployeeManager(employeeManager);		
	}

	@Override
	public void deleteEmployeeManagers(EmployeeManagers employeeManager) {
		employeeManagersDAO.deleteEmployeeManagers(employeeManager);		
	}

	@Override
	public EmployeeManagers getEmployeeManagersById(int employeeManagerId) {
		return employeeManagersDAO.getEmployeeManagersById(employeeManagerId);
	}

}
