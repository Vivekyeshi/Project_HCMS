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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeManagers(int employeeManagerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeManagers getEmployeeManagersById(int employeeManagerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
