package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vivek.entities.Roles;
import com.vivek.service.RolesServiceImpl;

public class RolesController {

	@Autowired
	private RolesServiceImpl rolesService;

	@GetMapping("/getRoles")
	public ResponseEntity<List<Roles>> getAllRoles() {
		return new ResponseEntity<List<Roles>>(rolesService.getAllRoles(), HttpStatus.OK);
	}

	@PostMapping("/addRoles")
	public ResponseEntity<Roles> addRole(@RequestBody Roles role) {
		if (role == null) {
			return new ResponseEntity<Roles>(HttpStatus.BAD_REQUEST);
		} else {
			rolesService.addRole(role);
			return new ResponseEntity<Roles>(HttpStatus.CREATED);
		}
	}

}
