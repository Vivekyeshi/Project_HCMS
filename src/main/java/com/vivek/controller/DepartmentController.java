package com.vivek.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.entities.Departments;
import com.vivek.service.DepartmentsServiceImpl;


@RestController
public class DepartmentController {
	
	private DepartmentsServiceImpl departmentService;
	
	public ResponseEntity<List<Departments>> getAllDepartments(){
		return ResponseEntity<List<Departments>> ;
		
	}

}
