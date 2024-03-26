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
	public void updateRole(Roles Role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRoles(int RoleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Roles getRolesById(int RoleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
