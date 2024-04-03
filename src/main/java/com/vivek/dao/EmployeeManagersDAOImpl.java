package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.EmployeeManagers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeManagersDAOImpl implements EmployeeManagersDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<EmployeeManagers> getAllEmployeeManagers() {
		return entityManager.unwrap(Session.class).createQuery("from EmployeeManagers",EmployeeManagers.class).getResultList();
	}

	@Override
	public void addEmployeeManager(EmployeeManagers employeeManager) {
		entityManager.unwrap(Session.class).persist(employeeManager);
		
	}

	@Override
	public void updateEmployeeManager(EmployeeManagers employeeManager) {
		entityManager.unwrap(Session.class).merge(employeeManager);		
	}

	@Override
	public void deleteEmployeeManagers(EmployeeManagers employeeManager) {
		entityManager.unwrap(Session.class).remove(employeeManager);		
	}

	@Override
	public EmployeeManagers getEmployeeManagersById(int employeeManagerId) {
		return entityManager.unwrap(Session.class).get(EmployeeManagers.class, employeeManagerId);
	}

}
