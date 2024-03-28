package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Roles;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RolesDAOImpl implements RolesDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Roles> getAllRoles() {
		return entityManager.unwrap(Session.class).createQuery("from Roles", Roles.class).getResultList();
	}

	@Override
	public void addRole(Roles role) {
		entityManager.unwrap(Session.class).persist(role);
		
	}

	@Override
	public void updateRole(Roles role) {
		entityManager.unwrap(Session.class).merge(role);		
	}

	@Override
	public void deleteRoles(Roles role) {
		entityManager.unwrap(Session.class).remove(role);		
	}

	@Override
	public Roles getRolesById(int roleId) {
		return entityManager.unwrap(Session.class).get(Roles.class,roleId);
	}

}
