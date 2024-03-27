package com.vivek.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vivek.entities.ApplicationStatus;
import com.vivek.entities.Employees;
import com.vivek.service.ApplicationStatusService;

@Controller
public class ApplicationStatusController {

	@Autowired
	private ApplicationStatusService applicationStatusService;
	
	@GetMapping("/allApplicationStatus")
	public ResponseEntity<List<ApplicationStatus>> getAllApplicationStatus() {
		return new ResponseEntity<List<ApplicationStatus>>(applicationStatusService.getAllApplicationStatus(),HttpStatus.OK);
	}
	
	@PostMapping("/addApplicationStatus")
	public ResponseEntity<ApplicationStatus> addApplicationStatus(@RequestBody ApplicationStatus applicationStatus) {
		if (applicationStatus == null) {
			return new ResponseEntity<ApplicationStatus>(HttpStatus.BAD_REQUEST);
		}
		applicationStatusService.addApplicationStatus(applicationStatus);
		return new ResponseEntity<ApplicationStatus>(HttpStatus.CREATED);
	}
	
}
