package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.EmployeesDAO;
import com.vivek.entities.Employees;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeesServiceImpl implements EmployeesService {
	
	@Autowired
	private EmployeesDAO employeesDAO;

	@Override
	public List<Employees> getAllEmployees() {

		return null;
	}

}
