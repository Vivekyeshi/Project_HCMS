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
	public ResponseEntity<Employees> addEmployee(@RequestBody Employees employee) {
		if (employee == null) {
			return new ResponseEntity<Employees>(HttpStatus.BAD_REQUEST);
		} else {
			employeesService.addEmployee(employee);
			return new ResponseEntity<Employees>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<Void> updateEmployee(@RequestBody Employees employeeToBeUpdate) {
		Employees existingEmployee = employeesService.getEmployeesById(employeeToBeUpdate.getEmployeeId());

		if (existingEmployee == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			employeesService.updateEmployee(employeeToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/employees/{employeeId}")
	public ResponseEntity<Employees> getEmployeeById(@PathVariable int employeeId) {

		return new ResponseEntity<Employees>(employeesService.getEmployeesById(employeeId), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable int employeeId) {
		
		Employees employee = employeesService.getEmployeesById(employeeId);
		
		if(employee == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			employeesService.deleteEmployees(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
