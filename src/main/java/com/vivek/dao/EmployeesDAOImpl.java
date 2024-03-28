package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Employees;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
 public class EmployeesDAOImpl implements EmployeesDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employees> getAllEmployees() {
		return entityManager.unwrap(Session.class).createQuery("from Employees", Employees.class).getResultList();
	}

	@Override
	public void addEmployee(Employees employee) {
		entityManager.unwrap(Session.class).persist(employee);
	}

	@Override
	public  void updateEmployee(Employees employee) {
			entityManager.unwrap(Session.class).merge(employee);
	}

	@Override
	public void deleteEmployees(Employees employee) {

		entityManager.unwrap(Session.class).remove(employee);
		
	}

	@Override
	public Employees getEmployeesById(int employeeId) {
		return entityManager.unwrap(Session.class).get(Employees.class, employeeId);
	}


}
