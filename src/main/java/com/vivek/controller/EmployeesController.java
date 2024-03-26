package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.entities.Employees;
import com.vivek.service.EmployeesServiceImpl;

@RestController("/emp")
public class EmployeesController {

	@Autowired
	private EmployeesServiceImpl employeesService;

	@GetMapping("/employees")
	public ResponseEntity<List<Employees>> getAll() {

		return new ResponseEntity<List<Employees>>(employeesService.getAllEmployees(), HttpStatus.OK);

	}  
	
	@PostMapping("/addEmployee")
	public ResponseEntity<Employees> addEmployee(Employees employee) {
		return null;
		
	}

}
