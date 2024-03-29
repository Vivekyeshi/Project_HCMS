package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Departments;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DepartmentsDAOImpl implements DepartmentDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Departments> getAllDepartments() {
		return entityManager.unwrap(Session.class).createQuery("from Departments", Departments.class).getResultList();
	}

	@Override
	public void addDepartment(Departments department) {
		entityManager.unwrap(Session.class).persist(department);
	}

	@Override
	public void updateDepartment(Departments department) {
		entityManager.unwrap(Session.class).merge(department);

	}

	@Override
	public void deleteDepartments(Departments department) {
		entityManager.unwrap(Session.class).remove(department);
		
	}

	@Override
	public Departments getDepartmentsById(int departmentId) {
		return entityManager.unwrap(Session.class).get(Departments.class, departmentId);
	}

	

	

	

}
