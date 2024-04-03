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

import com.vivek.entities.LeaveRequests;
import com.vivek.service.LeaveRequestsService;

@Controller
public class LeaveRequestsController {

	@Autowired
	private LeaveRequestsService leaveRequestsService;
	
	@GetMapping("/leaveRequests")
	public ResponseEntity<List<LeaveRequests>> getAll() {

		return new ResponseEntity<List<LeaveRequests>>(leaveRequestsService.getAllLeaveRequests(), HttpStatus.OK);
	}

	@PostMapping("/addLeaveRequest")
	public ResponseEntity<LeaveRequests> addLeaveRequest(@RequestBody LeaveRequests leaveRequest) {
		if (leaveRequest == null) {
			return new ResponseEntity<LeaveRequests>(HttpStatus.BAD_REQUEST);
		} else {
			leaveRequestsService.addLeaveRequest(leaveRequest);
			return new ResponseEntity<LeaveRequests>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateLeaveRequest")
	public ResponseEntity<Void> updateLeaveRequest(@RequestBody LeaveRequests leaveRequestToBeUpdate) {
		LeaveRequests existingLeaveRequest = leaveRequestsService.getLeaveRequestsById(leaveRequestToBeUpdate.getLeaveRequestId());

		if (existingLeaveRequest == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveRequestsService.updateLeaveRequest(leaveRequestToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/ getLeaveRequest/{leaveRequestId}")
	public ResponseEntity<LeaveRequests> getLeaveRequestById(@PathVariable int leaveRequestId) {

		return new ResponseEntity<LeaveRequests>(leaveRequestsService.getLeaveRequestsById(leaveRequestId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteLeaveRequest/{leaveRequestId}")
	public ResponseEntity<Void> deleteLeaveRequest(@PathVariable int leaveRequestId) {
		
		LeaveRequests leaveRequest = leaveRequestsService.getLeaveRequestsById(leaveRequestId);
		
		if(leaveRequest == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			leaveRequestsService.deleteLeaveRequests(leaveRequest);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
}
