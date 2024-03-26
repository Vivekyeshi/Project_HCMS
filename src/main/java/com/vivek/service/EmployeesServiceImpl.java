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

	public EmployeesDAO getEmployeesDAO() {
		return employeesDAO;
	}

	public void setEmployeesDAO(EmployeesDAO employeesDAO) {
		this.employeesDAO = employeesDAO;
	}

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployees(int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employees getEmployeesById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
