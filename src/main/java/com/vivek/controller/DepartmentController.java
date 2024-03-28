package com.vivek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.entities.Departments;
import com.vivek.service.DepartmentsServiceImpl;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentsServiceImpl departmentService;
	
	@GetMapping("/departments")
	public ResponseEntity<List<Departments>> getAllDepartments(){
		return new ResponseEntity<List<Departments>>(departmentService.getAllDepartments(),HttpStatus.OK) ;
	}
	
	@PostMapping("/addDepartment")
	public ResponseEntity<Departments> addDepartment(@RequestBody Departments department) {
		
		if(department == null) {
			return new ResponseEntity<Departments>(HttpStatus.BAD_REQUEST);
		}else {
			departmentService.addDepartment(department);
			return new ResponseEntity<Departments>(HttpStatus.CREATED);
		}
	}
	
	@PutMapping("/updateDepartment")
	public ResponseEntity<Void> updateDepartment(@RequestBody Departments departmentToBeUpdate) {
		Departments existingDepartment = departmentService.getDepartmentsById(departmentToBeUpdate.getDepartmentId());

		if (existingDepartment == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			departmentService.updateDepartment(departmentToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/departments/{departmentId}")
	public ResponseEntity<Departments> getDepartmentById(@PathVariable int departmentId) {

		return new ResponseEntity<Departments>(departmentService.getDepartmentsById(departmentId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteDepartment/{departmentId}")
	public ResponseEntity<Void> deleteDepartment(@PathVariable int departmentId) {
		
		Departments department = departmentService.getDepartmentsById(departmentId);
		
		if(department == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			departmentService.deleteDepartments(department);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
	

}
