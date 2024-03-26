package com.vivek.service;

import java.util.List;

import com.vivek.entities.Roles;

public interface RolesService {

		List<Roles> getAllRoles();
	
		void addRole(Roles role);
	
		void updateRole(Roles Role);
	
		void deleteRoles(int RoleId);
	
		Roles getRolesById(int RoleId);

}
