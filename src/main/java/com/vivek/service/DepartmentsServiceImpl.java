package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.DepartmentsDAOImpl;
import com.vivek.entities.Departments;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

	@Autowired
	DepartmentsDAOImpl departmentsDAO;


	@Override
	public List<Departments> getAllDepartments() {

		return departmentsDAO.getAllDepartments();

	}

	@Override
	public void addDepartment(Departments department) {

		departmentsDAO.addDepartment(department);
	}

	@Override
	public void updateDepartment(Departments department) {
		departmentsDAO. updateDepartment(department);

	}

	@Override
	public void deleteDepartments(Departments department) {
		departmentsDAO. deleteDepartments(department);

	}

	@Override
	public Departments getDepartmentsById(int departmentId) {
		return departmentsDAO.getDepartmentsById(departmentId);
	}

}
