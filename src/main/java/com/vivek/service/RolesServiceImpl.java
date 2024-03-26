package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.RolesDAO;
import com.vivek.entities.Roles;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	RolesDAO rolesDAO;

	@Override
	public List<Roles> getAllRoles() {

		return rolesDAO.getAllRoles();
	}

	public RolesDAO getRolesDAO() {
		return rolesDAO;
	}

	public void setRolesDAO(RolesDAO rolesDAO) {
		this.rolesDAO = rolesDAO;
	}

	@Override
	public void addRole(Roles role) {
		rolesDAO.addRole(role);
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
