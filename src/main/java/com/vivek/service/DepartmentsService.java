 package com.vivek.service;

import java.util.List;

import com.vivek.entities.Departments;

public interface DepartmentsService {
	
	List<Departments> getAllDepartments();

	void addDepartment(Departments department);

	void updateDepartment(Departments department);

	void deleteDepartments(int departmentId);

	Departments getDepartmentsById(int departmentId);

}
