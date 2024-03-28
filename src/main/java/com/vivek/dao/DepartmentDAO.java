package com.vivek.dao;

import java.util.List;

import com.vivek.entities.Departments;

public interface DepartmentDAO {

	List<Departments> getAllDepartments();

	void addDepartment(Departments department);

	void updateDepartment(Departments department);

	void deleteDepartments(Departments department);

	Departments getDepartmentsById(int departmentId);

}
