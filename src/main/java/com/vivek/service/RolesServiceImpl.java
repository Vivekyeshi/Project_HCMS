package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.RolesDAO;
import com.vivek.entities.Roles;

@Service
public class RolesServiceImpl implements RolesService {

	@Autowired
	private RolesDAO rolesDAO;

	@Override
	public List<Roles> getAllRoles() {

		return rolesDAO.getAllRoles();
	}

	@Override
	public void addRole(Roles role) {
		rolesDAO.addRole(role);
	}

	@Override
	public void updateRole(Roles role) {
		rolesDAO.updateRole(role);

	}

	@Override
	public Roles getRolesById(int roleId) {
		return rolesDAO.getRolesById(roleId);
	}

	@Override
	public void deleteRoles(Roles role) {
		rolesDAO.deleteRoles(role);
	}

}
