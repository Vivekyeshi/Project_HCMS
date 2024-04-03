package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vivek.entities.EmployeeManagers;
import com.vivek.service.EmployeeManagersService;


@Controller
public class EmployeeManagersController {
	
	@Autowired
	private EmployeeManagersService employeeManagersService;
	
	@GetMapping("/employeeManagers")
	public ResponseEntity<List<EmployeeManagers>> getAll() {

		return new ResponseEntity<List<EmployeeManagers>>(employeeManagersService.getAllEmployeeManagers(), HttpStatus.OK);
	}

	@PostMapping("/addEmployeeManagers")
	public ResponseEntity<EmployeeManagers> addEmployeeManager(@RequestBody EmployeeManagers employee) {
		if (employee == null) {
			return new ResponseEntity<EmployeeManagers>(HttpStatus.BAD_REQUEST);
		} else {
			employeeManagersService.addEmployeeManager(employee);
			return new ResponseEntity<EmployeeManagers>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateEmployeeManagers")
	public ResponseEntity<Void> updateEmployeeManager(@RequestBody EmployeeManagers employeeToBeUpdate) {
		EmployeeManagers existingEmployeeManager = employeeManagersService.getEmployeeManagersById(employeeToBeUpdate.getRelationshipId());

		if (existingEmployeeManager == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			employeeManagersService.updateEmployeeManager(employeeToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getEmployeeManager/{employeeId}")
	public ResponseEntity<EmployeeManagers> getEmployeeManagerById(@PathVariable int employeeId) {

		return new ResponseEntity<EmployeeManagers>(employeeManagersService.getEmployeeManagersById(employeeId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteEmployeeManagers/{employeeId}")
	public ResponseEntity<Void> deleteEmployeeManager(@PathVariable int employeeId) {
		
		EmployeeManagers employee = employeeManagersService.getEmployeeManagersById(employeeId);
		
		if(employee == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			employeeManagersService.deleteEmployeeManagers(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}

}
