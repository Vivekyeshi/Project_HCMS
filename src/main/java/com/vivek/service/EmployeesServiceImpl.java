package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.EmployeesDAO;
import com.vivek.entities.Employees;

@Service
public class EmployeesServiceImpl implements EmployeesService {
	@Autowired
	private EmployeesDAO employeesDAO;

	@Override
	public List<Employees> getAllEmployees() {
		return employeesDAO.getAllEmployees();
	}

	@Override
	public void addEmployee(Employees employee) {

		employeesDAO.addEmployee(employee);
	}

	@Override
	public void updateEmployee(Employees employee) {
		employeesDAO.updateEmployee(employee);

	}

	@Override
	public void deleteEmployees(Employees employee) {
		employeesDAO.deleteEmployees(employee);
	}

	@Override
	public Employees getEmployeesById(int employeeId) {
		return employeesDAO.getEmployeesById(employeeId);
	}

}
