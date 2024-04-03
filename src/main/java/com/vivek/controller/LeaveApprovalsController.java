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

import com.vivek.entities.LeaveApprovals;
import com.vivek.service.LeaveApprovalsService;

@Controller
public class LeaveApprovalsController {

	
	@Autowired
	private LeaveApprovalsService leaveApprovalsService;
	
	@GetMapping("/leaveApprovals")
	public ResponseEntity<List<LeaveApprovals>> getAll() {

		return new ResponseEntity<List<LeaveApprovals>>(leaveApprovalsService.getAllLeaveApprovals(), HttpStatus.OK);
	}

	@PostMapping("/addLeaveApproval")
	public ResponseEntity<LeaveApprovals> addLeaveApproval(@RequestBody LeaveApprovals leaveApproval) {
		if (leaveApproval == null) {
			return new ResponseEntity<LeaveApprovals>(HttpStatus.BAD_REQUEST);
		} else {
			leaveApprovalsService.addLeaveApproval(leaveApproval);
			return new ResponseEntity<LeaveApprovals>(HttpStatus.CREATED);
		}
	}

	@PutMapping("/updateLeaveApproval")
	public ResponseEntity<Void> updateLeaveApproval(@RequestBody LeaveApprovals leaveApprovalToBeUpdate) {
		LeaveApprovals existingLeaveApproval = leaveApprovalsService.getLeaveApprovalsById(leaveApprovalToBeUpdate.getApprovalId());

		if (existingLeaveApproval == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			leaveApprovalsService.updateLeaveApproval(leaveApprovalToBeUpdate);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	@GetMapping("/getLeaveApproval/{leaveApprovalId}")
	public ResponseEntity<LeaveApprovals> getLeaveApprovalById(@PathVariable int leaveApprovalId) {

		return new ResponseEntity<LeaveApprovals>(leaveApprovalsService.getLeaveApprovalsById(leaveApprovalId), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteLeaveApproval/{leaveApprovalId}")
	public ResponseEntity<Void> deleteLeaveApproval(@PathVariable int leaveApprovalId) {
		
		LeaveApprovals leaveApproval = leaveApprovalsService.getLeaveApprovalsById(leaveApprovalId);
		
		if(leaveApproval == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}else {
			leaveApprovalsService.deleteLeaveApprovals(leaveApproval);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
	}
	
}
