package com.vivek.dao;

import java.util.List;

import com.vivek.entities.Roles;

public interface RolesDAO {
	
List<Roles> getAllRoles();
	
	void addRole(Roles role);
	
	void updateRole(Roles Role);
	
	void deleteRoles(int RoleId);
	
	Roles getRolesById(int RoleId);

}
