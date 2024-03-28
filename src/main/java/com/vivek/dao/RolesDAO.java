package com.vivek.dao;

import java.util.List;

import com.vivek.entities.Roles;

public interface RolesDAO {

	List<Roles> getAllRoles();

	void addRole(Roles role);

	void updateRole(Roles role);

	void deleteRoles(Roles role);

	Roles getRolesById(int roleId);

}
