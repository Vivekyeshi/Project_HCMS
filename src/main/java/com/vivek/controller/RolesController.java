package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.entities.Roles;
import com.vivek.service.RolesServiceImpl;


@RestController
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
	
	@PutMapping("/updateRole")
	public ResponseEntity<Void> updateRole(@RequestBody Roles roleToBeUpdate) {
		Roles existingRole = rolesService.getRolesById(roleToBeUpdate.getRoleId());

		if (existingRole == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			rolesService.updateRole(roleToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/roles/{roleId}")
	public ResponseEntity<Roles> getRoleById(@PathVariable int roleId) {

		return new ResponseEntity<Roles>(rolesService.getRolesById(roleId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteRole/{roleId}")
	public ResponseEntity<Void> deleteRole(@PathVariable int roleId) {
		
		Roles role = rolesService.getRolesById(roleId);
		
		if(role == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			rolesService.deleteRoles(role);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}

}
