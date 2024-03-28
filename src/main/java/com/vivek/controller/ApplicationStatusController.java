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

import com.vivek.entities.ApplicationStatus;
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
	

	@PutMapping("/updateApplicationStatus")
	public ResponseEntity<Void> updateApplicationStatus(@RequestBody ApplicationStatus applicationStatusToBeUpdate) {
		ApplicationStatus existingApplicationStatus = applicationStatusService.getApplicationStatusById(applicationStatusToBeUpdate.getApplicationId());

		if (existingApplicationStatus == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			applicationStatusService.updateApplicationStatus(applicationStatusToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/applicationStatus/{applicationStatusId}")
	public ResponseEntity<ApplicationStatus> getApplicationStatusById(@PathVariable int applicationStatusId) {

		return new ResponseEntity<ApplicationStatus>(applicationStatusService.getApplicationStatusById(applicationStatusId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteApplicationStatus/{applicationStatusId}")
	public ResponseEntity<Void> deleteApplicationStatus(@PathVariable int applicationStatusId) {
		
		ApplicationStatus applicationStatus = applicationStatusService.getApplicationStatusById(applicationStatusId);
		
		if(applicationStatus == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			applicationStatusService.deleteApplicationStatus(applicationStatus);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
	
}
