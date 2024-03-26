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

	public DepartmentsDAOImpl getDepartmentsDAO() {
		return departmentsDAO;
	}

	public void setDepartmentsDAO(DepartmentsDAOImpl departmentsDAO) {
		this.departmentsDAO = departmentsDAO;
	}

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
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDepartments(int departmentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Departments getDepartmentsById(int departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
